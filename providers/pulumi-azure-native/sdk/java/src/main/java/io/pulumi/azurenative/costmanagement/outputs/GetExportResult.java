// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.azurenative.costmanagement.outputs.ExportDefinitionResponse;
import io.pulumi.azurenative.costmanagement.outputs.ExportDeliveryInfoResponse;
import io.pulumi.azurenative.costmanagement.outputs.ExportExecutionListResultResponse;
import io.pulumi.azurenative.costmanagement.outputs.ExportScheduleResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetExportResult {
    /**
     * Has the definition for the export.
     * 
     */
    private final ExportDefinitionResponse definition;
    /**
     * Has delivery information for the export.
     * 
     */
    private final ExportDeliveryInfoResponse deliveryInfo;
    /**
     * eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the user is updating the latest version or not.
     * 
     */
    private final @Nullable String eTag;
    /**
     * The format of the export being delivered. Currently only 'Csv' is supported.
     * 
     */
    private final @Nullable String format;
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * If the export has an active schedule, provides an estimate of the next execution time.
     * 
     */
    private final String nextRunTimeEstimate;
    /**
     * If requested, has the most recent execution history for the export.
     * 
     */
    private final @Nullable ExportExecutionListResultResponse runHistory;
    /**
     * Has schedule information for the export.
     * 
     */
    private final @Nullable ExportScheduleResponse schedule;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"definition","deliveryInfo","eTag","format","id","name","nextRunTimeEstimate","runHistory","schedule","type"})
    private GetExportResult(
        ExportDefinitionResponse definition,
        ExportDeliveryInfoResponse deliveryInfo,
        @Nullable String eTag,
        @Nullable String format,
        String id,
        String name,
        String nextRunTimeEstimate,
        @Nullable ExportExecutionListResultResponse runHistory,
        @Nullable ExportScheduleResponse schedule,
        String type) {
        this.definition = Objects.requireNonNull(definition);
        this.deliveryInfo = Objects.requireNonNull(deliveryInfo);
        this.eTag = eTag;
        this.format = format;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.nextRunTimeEstimate = Objects.requireNonNull(nextRunTimeEstimate);
        this.runHistory = runHistory;
        this.schedule = schedule;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Has the definition for the export.
     * 
     */
    public ExportDefinitionResponse getDefinition() {
        return this.definition;
    }
    /**
     * Has delivery information for the export.
     * 
     */
    public ExportDeliveryInfoResponse getDeliveryInfo() {
        return this.deliveryInfo;
    }
    /**
     * eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the user is updating the latest version or not.
     * 
     */
    public Optional<String> getETag() {
        return Optional.ofNullable(this.eTag);
    }
    /**
     * The format of the export being delivered. Currently only 'Csv' is supported.
     * 
     */
    public Optional<String> getFormat() {
        return Optional.ofNullable(this.format);
    }
    /**
     * Resource Id.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * If the export has an active schedule, provides an estimate of the next execution time.
     * 
     */
    public String getNextRunTimeEstimate() {
        return this.nextRunTimeEstimate;
    }
    /**
     * If requested, has the most recent execution history for the export.
     * 
     */
    public Optional<ExportExecutionListResultResponse> getRunHistory() {
        return Optional.ofNullable(this.runHistory);
    }
    /**
     * Has schedule information for the export.
     * 
     */
    public Optional<ExportScheduleResponse> getSchedule() {
        return Optional.ofNullable(this.schedule);
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExportResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExportDefinitionResponse definition;
        private ExportDeliveryInfoResponse deliveryInfo;
        private @Nullable String eTag;
        private @Nullable String format;
        private String id;
        private String name;
        private String nextRunTimeEstimate;
        private @Nullable ExportExecutionListResultResponse runHistory;
        private @Nullable ExportScheduleResponse schedule;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExportResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.definition = defaults.definition;
    	      this.deliveryInfo = defaults.deliveryInfo;
    	      this.eTag = defaults.eTag;
    	      this.format = defaults.format;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.nextRunTimeEstimate = defaults.nextRunTimeEstimate;
    	      this.runHistory = defaults.runHistory;
    	      this.schedule = defaults.schedule;
    	      this.type = defaults.type;
        }

        public Builder setDefinition(ExportDefinitionResponse definition) {
            this.definition = Objects.requireNonNull(definition);
            return this;
        }

        public Builder setDeliveryInfo(ExportDeliveryInfoResponse deliveryInfo) {
            this.deliveryInfo = Objects.requireNonNull(deliveryInfo);
            return this;
        }

        public Builder setETag(@Nullable String eTag) {
            this.eTag = eTag;
            return this;
        }

        public Builder setFormat(@Nullable String format) {
            this.format = format;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNextRunTimeEstimate(String nextRunTimeEstimate) {
            this.nextRunTimeEstimate = Objects.requireNonNull(nextRunTimeEstimate);
            return this;
        }

        public Builder setRunHistory(@Nullable ExportExecutionListResultResponse runHistory) {
            this.runHistory = runHistory;
            return this;
        }

        public Builder setSchedule(@Nullable ExportScheduleResponse schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetExportResult build() {
            return new GetExportResult(definition, deliveryInfo, eTag, format, id, name, nextRunTimeEstimate, runHistory, schedule, type);
        }
    }
}
