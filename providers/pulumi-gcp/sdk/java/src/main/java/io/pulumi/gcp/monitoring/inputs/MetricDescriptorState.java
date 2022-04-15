// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.monitoring.inputs.MetricDescriptorLabelGetArgs;
import io.pulumi.gcp.monitoring.inputs.MetricDescriptorMetadataGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MetricDescriptorState extends io.pulumi.resources.ResourceArgs {

    public static final MetricDescriptorState Empty = new MetricDescriptorState();

    /**
     * A human-readable description for the label.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * A concise name for the metric, which can be displayed in user interfaces. Use sentence case without an ending period, for example "Request count".
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * The set of labels that can be used to describe a specific instance of this metric type. In order to delete a label, the entire resource must be deleted, then created with the desired labels.
     * Structure is documented below.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<List<MetricDescriptorLabelGetArgs>> labels;

    public Output<List<MetricDescriptorLabelGetArgs>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * The launch stage of the metric definition.
     * Possible values are `LAUNCH_STAGE_UNSPECIFIED`, `UNIMPLEMENTED`, `PRELAUNCH`, `EARLY_ACCESS`, `ALPHA`, `BETA`, `GA`, and `DEPRECATED`.
     * 
     */
    @Import(name="launchStage")
      private final @Nullable Output<String> launchStage;

    public Output<String> launchStage() {
        return this.launchStage == null ? Codegen.empty() : this.launchStage;
    }

    /**
     * Metadata which can be used to guide usage of the metric.
     * Structure is documented below.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<MetricDescriptorMetadataGetArgs> metadata;

    public Output<MetricDescriptorMetadataGetArgs> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * Whether the metric records instantaneous values, changes to a value, etc. Some combinations of metricKind and valueType might not be supported.
     * Possible values are `METRIC_KIND_UNSPECIFIED`, `GAUGE`, `DELTA`, and `CUMULATIVE`.
     * 
     */
    @Import(name="metricKind")
      private final @Nullable Output<String> metricKind;

    public Output<String> metricKind() {
        return this.metricKind == null ? Codegen.empty() : this.metricKind;
    }

    /**
     * If present, then a time series, which is identified partially by a metric type and a MonitoredResourceDescriptor, that
     * is associated with this metric type can only be associated with one of the monitored resource types listed here. This
     * field allows time series to be associated with the intersection of this metric type and the monitored resource types in
     * this list.
     * 
     */
    @Import(name="monitoredResourceTypes")
      private final @Nullable Output<List<String>> monitoredResourceTypes;

    public Output<List<String>> monitoredResourceTypes() {
        return this.monitoredResourceTypes == null ? Codegen.empty() : this.monitoredResourceTypes;
    }

    /**
     * The resource name of the metric descriptor.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The metric type, including its DNS name prefix. The type is not URL-encoded. All service defined metrics must be prefixed with the service name, in the format of {service name}/{relative metric name}, such as cloudsql.googleapis.com/database/cpu/utilization. The relative metric name must have only upper and lower-case letters, digits, '/' and underscores '_' are allowed. Additionally, the maximum number of characters allowed for the relative_metric_name is 100. All user-defined metric types have the DNS name custom.googleapis.com, external.googleapis.com, or logging.googleapis.com/user/.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    /**
     * The units in which the metric value is reported. It is only applicable if the
     * valueType is INT64, DOUBLE, or DISTRIBUTION. The unit defines the representation of
     * the stored metric values.
     * Different systems may scale the values to be more easily displayed (so a value of
     * 0.02KBy might be displayed as 20By, and a value of 3523KBy might be displayed as
     * 3.5MBy). However, if the unit is KBy, then the value of the metric is always in
     * thousands of bytes, no matter how it may be displayed.
     * If you want a custom metric to record the exact number of CPU-seconds used by a job,
     * you can create an INT64 CUMULATIVE metric whose unit is s{CPU} (or equivalently
     * 1s{CPU} or just s). If the job uses 12,005 CPU-seconds, then the value is written as
     * 12005.
     * Alternatively, if you want a custom metric to record data in a more granular way, you
     * can create a DOUBLE CUMULATIVE metric whose unit is ks{CPU}, and then write the value
     * 12.005 (which is 12005/1000), or use Kis{CPU} and write 11.723 (which is 12005/1024).
     * The supported units are a subset of The Unified Code for Units of Measure standard.
     * More info can be found in the API documentation
     * (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.metricDescriptors).
     * 
     */
    @Import(name="unit")
      private final @Nullable Output<String> unit;

    public Output<String> unit() {
        return this.unit == null ? Codegen.empty() : this.unit;
    }

    /**
     * The type of data that can be assigned to the label.
     * Default value is `STRING`.
     * Possible values are `STRING`, `BOOL`, and `INT64`.
     * 
     */
    @Import(name="valueType")
      private final @Nullable Output<String> valueType;

    public Output<String> valueType() {
        return this.valueType == null ? Codegen.empty() : this.valueType;
    }

    public MetricDescriptorState(
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        @Nullable Output<List<MetricDescriptorLabelGetArgs>> labels,
        @Nullable Output<String> launchStage,
        @Nullable Output<MetricDescriptorMetadataGetArgs> metadata,
        @Nullable Output<String> metricKind,
        @Nullable Output<List<String>> monitoredResourceTypes,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> type,
        @Nullable Output<String> unit,
        @Nullable Output<String> valueType) {
        this.description = description;
        this.displayName = displayName;
        this.labels = labels;
        this.launchStage = launchStage;
        this.metadata = metadata;
        this.metricKind = metricKind;
        this.monitoredResourceTypes = monitoredResourceTypes;
        this.name = name;
        this.project = project;
        this.type = type;
        this.unit = unit;
        this.valueType = valueType;
    }

    private MetricDescriptorState() {
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.labels = Codegen.empty();
        this.launchStage = Codegen.empty();
        this.metadata = Codegen.empty();
        this.metricKind = Codegen.empty();
        this.monitoredResourceTypes = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.type = Codegen.empty();
        this.unit = Codegen.empty();
        this.valueType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricDescriptorState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private @Nullable Output<List<MetricDescriptorLabelGetArgs>> labels;
        private @Nullable Output<String> launchStage;
        private @Nullable Output<MetricDescriptorMetadataGetArgs> metadata;
        private @Nullable Output<String> metricKind;
        private @Nullable Output<List<String>> monitoredResourceTypes;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> type;
        private @Nullable Output<String> unit;
        private @Nullable Output<String> valueType;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricDescriptorState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.launchStage = defaults.launchStage;
    	      this.metadata = defaults.metadata;
    	      this.metricKind = defaults.metricKind;
    	      this.monitoredResourceTypes = defaults.monitoredResourceTypes;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.type = defaults.type;
    	      this.unit = defaults.unit;
    	      this.valueType = defaults.valueType;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder labels(@Nullable Output<List<MetricDescriptorLabelGetArgs>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable List<MetricDescriptorLabelGetArgs> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder labels(MetricDescriptorLabelGetArgs... labels) {
            return labels(List.of(labels));
        }
        public Builder launchStage(@Nullable Output<String> launchStage) {
            this.launchStage = launchStage;
            return this;
        }
        public Builder launchStage(@Nullable String launchStage) {
            this.launchStage = Codegen.ofNullable(launchStage);
            return this;
        }
        public Builder metadata(@Nullable Output<MetricDescriptorMetadataGetArgs> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable MetricDescriptorMetadataGetArgs metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }
        public Builder metricKind(@Nullable Output<String> metricKind) {
            this.metricKind = metricKind;
            return this;
        }
        public Builder metricKind(@Nullable String metricKind) {
            this.metricKind = Codegen.ofNullable(metricKind);
            return this;
        }
        public Builder monitoredResourceTypes(@Nullable Output<List<String>> monitoredResourceTypes) {
            this.monitoredResourceTypes = monitoredResourceTypes;
            return this;
        }
        public Builder monitoredResourceTypes(@Nullable List<String> monitoredResourceTypes) {
            this.monitoredResourceTypes = Codegen.ofNullable(monitoredResourceTypes);
            return this;
        }
        public Builder monitoredResourceTypes(String... monitoredResourceTypes) {
            return monitoredResourceTypes(List.of(monitoredResourceTypes));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }
        public Builder unit(@Nullable Output<String> unit) {
            this.unit = unit;
            return this;
        }
        public Builder unit(@Nullable String unit) {
            this.unit = Codegen.ofNullable(unit);
            return this;
        }
        public Builder valueType(@Nullable Output<String> valueType) {
            this.valueType = valueType;
            return this;
        }
        public Builder valueType(@Nullable String valueType) {
            this.valueType = Codegen.ofNullable(valueType);
            return this;
        }        public MetricDescriptorState build() {
            return new MetricDescriptorState(description, displayName, labels, launchStage, metadata, metricKind, monitoredResourceTypes, name, project, type, unit, valueType);
        }
    }
}
