// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement;

import io.pulumi.azurenative.costmanagement.enums.FormatType;
import io.pulumi.azurenative.costmanagement.inputs.ReportDefinitionArgs;
import io.pulumi.azurenative.costmanagement.inputs.ReportDeliveryInfoArgs;
import io.pulumi.azurenative.costmanagement.inputs.ReportScheduleArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReportArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReportArgs Empty = new ReportArgs();

    /**
     * Has definition for the report.
     * 
     */
    @Import(name="definition", required=true)
      private final Output<ReportDefinitionArgs> definition;

    public Output<ReportDefinitionArgs> getDefinition() {
        return this.definition;
    }

    /**
     * Has delivery information for the report.
     * 
     */
    @Import(name="deliveryInfo", required=true)
      private final Output<ReportDeliveryInfoArgs> deliveryInfo;

    public Output<ReportDeliveryInfoArgs> getDeliveryInfo() {
        return this.deliveryInfo;
    }

    /**
     * The format of the report being delivered.
     * 
     */
    @Import(name="format")
      private final @Nullable Output<Either<String,FormatType>> format;

    public Output<Either<String,FormatType>> getFormat() {
        return this.format == null ? Output.empty() : this.format;
    }

    /**
     * Report Name.
     * 
     */
    @Import(name="reportName")
      private final @Nullable Output<String> reportName;

    public Output<String> getReportName() {
        return this.reportName == null ? Output.empty() : this.reportName;
    }

    /**
     * Has schedule information for the report.
     * 
     */
    @Import(name="schedule")
      private final @Nullable Output<ReportScheduleArgs> schedule;

    public Output<ReportScheduleArgs> getSchedule() {
        return this.schedule == null ? Output.empty() : this.schedule;
    }

    public ReportArgs(
        Output<ReportDefinitionArgs> definition,
        Output<ReportDeliveryInfoArgs> deliveryInfo,
        @Nullable Output<Either<String,FormatType>> format,
        @Nullable Output<String> reportName,
        @Nullable Output<ReportScheduleArgs> schedule) {
        this.definition = Objects.requireNonNull(definition, "expected parameter 'definition' to be non-null");
        this.deliveryInfo = Objects.requireNonNull(deliveryInfo, "expected parameter 'deliveryInfo' to be non-null");
        this.format = format;
        this.reportName = reportName;
        this.schedule = schedule;
    }

    private ReportArgs() {
        this.definition = Output.empty();
        this.deliveryInfo = Output.empty();
        this.format = Output.empty();
        this.reportName = Output.empty();
        this.schedule = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ReportDefinitionArgs> definition;
        private Output<ReportDeliveryInfoArgs> deliveryInfo;
        private @Nullable Output<Either<String,FormatType>> format;
        private @Nullable Output<String> reportName;
        private @Nullable Output<ReportScheduleArgs> schedule;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.definition = defaults.definition;
    	      this.deliveryInfo = defaults.deliveryInfo;
    	      this.format = defaults.format;
    	      this.reportName = defaults.reportName;
    	      this.schedule = defaults.schedule;
        }

        public Builder definition(Output<ReportDefinitionArgs> definition) {
            this.definition = Objects.requireNonNull(definition);
            return this;
        }

        public Builder definition(ReportDefinitionArgs definition) {
            this.definition = Output.of(Objects.requireNonNull(definition));
            return this;
        }

        public Builder deliveryInfo(Output<ReportDeliveryInfoArgs> deliveryInfo) {
            this.deliveryInfo = Objects.requireNonNull(deliveryInfo);
            return this;
        }

        public Builder deliveryInfo(ReportDeliveryInfoArgs deliveryInfo) {
            this.deliveryInfo = Output.of(Objects.requireNonNull(deliveryInfo));
            return this;
        }

        public Builder format(@Nullable Output<Either<String,FormatType>> format) {
            this.format = format;
            return this;
        }

        public Builder format(@Nullable Either<String,FormatType> format) {
            this.format = Output.ofNullable(format);
            return this;
        }

        public Builder reportName(@Nullable Output<String> reportName) {
            this.reportName = reportName;
            return this;
        }

        public Builder reportName(@Nullable String reportName) {
            this.reportName = Output.ofNullable(reportName);
            return this;
        }

        public Builder schedule(@Nullable Output<ReportScheduleArgs> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder schedule(@Nullable ReportScheduleArgs schedule) {
            this.schedule = Output.ofNullable(schedule);
            return this;
        }
        public ReportArgs build() {
            return new ReportArgs(definition, deliveryInfo, format, reportName, schedule);
        }
    }
}
