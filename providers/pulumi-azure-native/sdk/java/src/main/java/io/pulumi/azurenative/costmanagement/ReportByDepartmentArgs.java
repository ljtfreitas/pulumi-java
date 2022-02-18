// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement;

import io.pulumi.azurenative.costmanagement.enums.FormatType;
import io.pulumi.azurenative.costmanagement.inputs.ReportDefinitionArgs;
import io.pulumi.azurenative.costmanagement.inputs.ReportDeliveryInfoArgs;
import io.pulumi.azurenative.costmanagement.inputs.ReportScheduleArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReportByDepartmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReportByDepartmentArgs Empty = new ReportByDepartmentArgs();

    /**
     * Has definition for the report.
     * 
     */
    @InputImport(name="definition", required=true)
    private final Input<ReportDefinitionArgs> definition;

    public Input<ReportDefinitionArgs> getDefinition() {
        return this.definition;
    }

    /**
     * Has delivery information for the report.
     * 
     */
    @InputImport(name="deliveryInfo", required=true)
    private final Input<ReportDeliveryInfoArgs> deliveryInfo;

    public Input<ReportDeliveryInfoArgs> getDeliveryInfo() {
        return this.deliveryInfo;
    }

    /**
     * Department ID
     * 
     */
    @InputImport(name="departmentId", required=true)
    private final Input<String> departmentId;

    public Input<String> getDepartmentId() {
        return this.departmentId;
    }

    /**
     * The format of the report being delivered.
     * 
     */
    @InputImport(name="format")
    private final @Nullable Input<Either<String,FormatType>> format;

    public Input<Either<String,FormatType>> getFormat() {
        return this.format == null ? Input.empty() : this.format;
    }

    /**
     * Report Name.
     * 
     */
    @InputImport(name="reportName")
    private final @Nullable Input<String> reportName;

    public Input<String> getReportName() {
        return this.reportName == null ? Input.empty() : this.reportName;
    }

    /**
     * Has schedule information for the report.
     * 
     */
    @InputImport(name="schedule")
    private final @Nullable Input<ReportScheduleArgs> schedule;

    public Input<ReportScheduleArgs> getSchedule() {
        return this.schedule == null ? Input.empty() : this.schedule;
    }

    public ReportByDepartmentArgs(
        Input<ReportDefinitionArgs> definition,
        Input<ReportDeliveryInfoArgs> deliveryInfo,
        Input<String> departmentId,
        @Nullable Input<Either<String,FormatType>> format,
        @Nullable Input<String> reportName,
        @Nullable Input<ReportScheduleArgs> schedule) {
        this.definition = Objects.requireNonNull(definition, "expected parameter 'definition' to be non-null");
        this.deliveryInfo = Objects.requireNonNull(deliveryInfo, "expected parameter 'deliveryInfo' to be non-null");
        this.departmentId = Objects.requireNonNull(departmentId, "expected parameter 'departmentId' to be non-null");
        this.format = format;
        this.reportName = reportName;
        this.schedule = schedule;
    }

    private ReportByDepartmentArgs() {
        this.definition = Input.empty();
        this.deliveryInfo = Input.empty();
        this.departmentId = Input.empty();
        this.format = Input.empty();
        this.reportName = Input.empty();
        this.schedule = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportByDepartmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ReportDefinitionArgs> definition;
        private Input<ReportDeliveryInfoArgs> deliveryInfo;
        private Input<String> departmentId;
        private @Nullable Input<Either<String,FormatType>> format;
        private @Nullable Input<String> reportName;
        private @Nullable Input<ReportScheduleArgs> schedule;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportByDepartmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.definition = defaults.definition;
    	      this.deliveryInfo = defaults.deliveryInfo;
    	      this.departmentId = defaults.departmentId;
    	      this.format = defaults.format;
    	      this.reportName = defaults.reportName;
    	      this.schedule = defaults.schedule;
        }

        public Builder setDefinition(Input<ReportDefinitionArgs> definition) {
            this.definition = Objects.requireNonNull(definition);
            return this;
        }

        public Builder setDefinition(ReportDefinitionArgs definition) {
            this.definition = Input.of(Objects.requireNonNull(definition));
            return this;
        }

        public Builder setDeliveryInfo(Input<ReportDeliveryInfoArgs> deliveryInfo) {
            this.deliveryInfo = Objects.requireNonNull(deliveryInfo);
            return this;
        }

        public Builder setDeliveryInfo(ReportDeliveryInfoArgs deliveryInfo) {
            this.deliveryInfo = Input.of(Objects.requireNonNull(deliveryInfo));
            return this;
        }

        public Builder setDepartmentId(Input<String> departmentId) {
            this.departmentId = Objects.requireNonNull(departmentId);
            return this;
        }

        public Builder setDepartmentId(String departmentId) {
            this.departmentId = Input.of(Objects.requireNonNull(departmentId));
            return this;
        }

        public Builder setFormat(@Nullable Input<Either<String,FormatType>> format) {
            this.format = format;
            return this;
        }

        public Builder setFormat(@Nullable Either<String,FormatType> format) {
            this.format = Input.ofNullable(format);
            return this;
        }

        public Builder setReportName(@Nullable Input<String> reportName) {
            this.reportName = reportName;
            return this;
        }

        public Builder setReportName(@Nullable String reportName) {
            this.reportName = Input.ofNullable(reportName);
            return this;
        }

        public Builder setSchedule(@Nullable Input<ReportScheduleArgs> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder setSchedule(@Nullable ReportScheduleArgs schedule) {
            this.schedule = Input.ofNullable(schedule);
            return this;
        }

        public ReportByDepartmentArgs build() {
            return new ReportByDepartmentArgs(definition, deliveryInfo, departmentId, format, reportName, schedule);
        }
    }
}
