// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The related metadata items for the function.
 * 
 */
public final class LogAnalyticsQueryPackQueryPropertiesResponseRelated extends io.pulumi.resources.InvokeArgs {

    public static final LogAnalyticsQueryPackQueryPropertiesResponseRelated Empty = new LogAnalyticsQueryPackQueryPropertiesResponseRelated();

    /**
     * The related categories for the function.
     * 
     */
    @Import(name="categories")
      private final @Nullable List<String> categories;

    public List<String> getCategories() {
        return this.categories == null ? List.of() : this.categories;
    }

    /**
     * The related resource types for the function.
     * 
     */
    @Import(name="resourceTypes")
      private final @Nullable List<String> resourceTypes;

    public List<String> getResourceTypes() {
        return this.resourceTypes == null ? List.of() : this.resourceTypes;
    }

    /**
     * The related Log Analytics solutions for the function.
     * 
     */
    @Import(name="solutions")
      private final @Nullable List<String> solutions;

    public List<String> getSolutions() {
        return this.solutions == null ? List.of() : this.solutions;
    }

    public LogAnalyticsQueryPackQueryPropertiesResponseRelated(
        @Nullable List<String> categories,
        @Nullable List<String> resourceTypes,
        @Nullable List<String> solutions) {
        this.categories = categories;
        this.resourceTypes = resourceTypes;
        this.solutions = solutions;
    }

    private LogAnalyticsQueryPackQueryPropertiesResponseRelated() {
        this.categories = List.of();
        this.resourceTypes = List.of();
        this.solutions = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogAnalyticsQueryPackQueryPropertiesResponseRelated defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> categories;
        private @Nullable List<String> resourceTypes;
        private @Nullable List<String> solutions;

        public Builder() {
    	      // Empty
        }

        public Builder(LogAnalyticsQueryPackQueryPropertiesResponseRelated defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categories = defaults.categories;
    	      this.resourceTypes = defaults.resourceTypes;
    	      this.solutions = defaults.solutions;
        }

        public Builder categories(@Nullable List<String> categories) {
            this.categories = categories;
            return this;
        }

        public Builder resourceTypes(@Nullable List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }

        public Builder solutions(@Nullable List<String> solutions) {
            this.solutions = solutions;
            return this;
        }
        public LogAnalyticsQueryPackQueryPropertiesResponseRelated build() {
            return new LogAnalyticsQueryPackQueryPropertiesResponseRelated(categories, resourceTypes, solutions);
        }
    }
}
