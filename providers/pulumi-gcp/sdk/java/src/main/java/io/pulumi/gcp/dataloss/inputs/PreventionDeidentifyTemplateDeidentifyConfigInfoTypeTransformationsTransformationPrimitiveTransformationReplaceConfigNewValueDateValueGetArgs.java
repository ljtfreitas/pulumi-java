// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueGetArgs Empty = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueGetArgs();

    /**
     * Day of month. Must be from 1 to 31 and valid for the year and month, or 0 if specifying a
     * year by itself or a year and month where the day is not significant.
     * 
     */
    @Import(name="day")
      private final @Nullable Output<Integer> day;

    public Output<Integer> day() {
        return this.day == null ? Codegen.empty() : this.day;
    }

    /**
     * Month of year. Must be from 1 to 12, or 0 if specifying a year without a month and day.
     * 
     */
    @Import(name="month")
      private final @Nullable Output<Integer> month;

    public Output<Integer> month() {
        return this.month == null ? Codegen.empty() : this.month;
    }

    /**
     * Year of date. Must be from 1 to 9999, or 0 if specifying a date without a year.
     * 
     */
    @Import(name="year")
      private final @Nullable Output<Integer> year;

    public Output<Integer> year() {
        return this.year == null ? Codegen.empty() : this.year;
    }

    public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueGetArgs(
        @Nullable Output<Integer> day,
        @Nullable Output<Integer> month,
        @Nullable Output<Integer> year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueGetArgs() {
        this.day = Codegen.empty();
        this.month = Codegen.empty();
        this.year = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> day;
        private @Nullable Output<Integer> month;
        private @Nullable Output<Integer> year;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.month = defaults.month;
    	      this.year = defaults.year;
        }

        public Builder day(@Nullable Output<Integer> day) {
            this.day = day;
            return this;
        }
        public Builder day(@Nullable Integer day) {
            this.day = Codegen.ofNullable(day);
            return this;
        }
        public Builder month(@Nullable Output<Integer> month) {
            this.month = month;
            return this;
        }
        public Builder month(@Nullable Integer month) {
            this.month = Codegen.ofNullable(month);
            return this;
        }
        public Builder year(@Nullable Output<Integer> year) {
            this.year = year;
            return this;
        }
        public Builder year(@Nullable Integer year) {
            this.year = Codegen.ofNullable(year);
            return this;
        }        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueGetArgs build() {
            return new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueGetArgs(day, month, year);
        }
    }
}
