package ru.yandex.practicum.contacts.presentation.filter;

import ru.yandex.practicum.contacts.presentation.base.ListDiffInterface;
import ru.yandex.practicum.contacts.presentation.filter.model.FilterContactType;

public class FilterContactTypeUi implements ListDiffInterface<FilterContactTypeUi> {

    @Override
    public boolean theSameAs(FilterContactTypeUi newfilterContactTypeUi) {
        return this.getContactType() == newfilterContactTypeUi.getContactType();
    }

    public FilterContactType getContactType() {
        return null;
    }

    public boolean isSelected() {
        return false;
    }
}
