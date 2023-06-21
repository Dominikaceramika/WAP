package com.uep.wap.model;

import com.uep.wap.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Date;
import java.util.List;

public class FilterForm {
    private String date;
    private String player;
    private String category;
    private Date startDate;
    private Date endDate;

    @Autowired
    private MatchService matchService;


    @PostMapping("/filter")
    public String filterMatches(@ModelAttribute("filterForm") FilterForm filterForm, Model model) {

        List<Match> filteredMatches = matchService.filterMatches(filterForm);

        model.addAttribute("filteredMatches", filteredMatches);

        return "score";
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
