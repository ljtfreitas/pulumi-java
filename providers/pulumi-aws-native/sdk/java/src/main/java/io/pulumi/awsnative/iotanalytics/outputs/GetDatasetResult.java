// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.outputs;

import io.pulumi.awsnative.iotanalytics.outputs.DatasetAction;
import io.pulumi.awsnative.iotanalytics.outputs.DatasetContentDeliveryRule;
import io.pulumi.awsnative.iotanalytics.outputs.DatasetLateDataRule;
import io.pulumi.awsnative.iotanalytics.outputs.DatasetRetentionPeriod;
import io.pulumi.awsnative.iotanalytics.outputs.DatasetTag;
import io.pulumi.awsnative.iotanalytics.outputs.DatasetTrigger;
import io.pulumi.awsnative.iotanalytics.outputs.DatasetVersioningConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDatasetResult {
    private final @Nullable List<DatasetAction> actions;
    private final @Nullable List<DatasetContentDeliveryRule> contentDeliveryRules;
    private final @Nullable String id;
    private final @Nullable List<DatasetLateDataRule> lateDataRules;
    private final @Nullable DatasetRetentionPeriod retentionPeriod;
    private final @Nullable List<DatasetTag> tags;
    private final @Nullable List<DatasetTrigger> triggers;
    private final @Nullable DatasetVersioningConfiguration versioningConfiguration;

    @OutputCustomType.Constructor({"actions","contentDeliveryRules","id","lateDataRules","retentionPeriod","tags","triggers","versioningConfiguration"})
    private GetDatasetResult(
        @Nullable List<DatasetAction> actions,
        @Nullable List<DatasetContentDeliveryRule> contentDeliveryRules,
        @Nullable String id,
        @Nullable List<DatasetLateDataRule> lateDataRules,
        @Nullable DatasetRetentionPeriod retentionPeriod,
        @Nullable List<DatasetTag> tags,
        @Nullable List<DatasetTrigger> triggers,
        @Nullable DatasetVersioningConfiguration versioningConfiguration) {
        this.actions = actions;
        this.contentDeliveryRules = contentDeliveryRules;
        this.id = id;
        this.lateDataRules = lateDataRules;
        this.retentionPeriod = retentionPeriod;
        this.tags = tags;
        this.triggers = triggers;
        this.versioningConfiguration = versioningConfiguration;
    }

    public List<DatasetAction> getActions() {
        return this.actions == null ? List.of() : this.actions;
    }
    public List<DatasetContentDeliveryRule> getContentDeliveryRules() {
        return this.contentDeliveryRules == null ? List.of() : this.contentDeliveryRules;
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public List<DatasetLateDataRule> getLateDataRules() {
        return this.lateDataRules == null ? List.of() : this.lateDataRules;
    }
    public Optional<DatasetRetentionPeriod> getRetentionPeriod() {
        return Optional.ofNullable(this.retentionPeriod);
    }
    public List<DatasetTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public List<DatasetTrigger> getTriggers() {
        return this.triggers == null ? List.of() : this.triggers;
    }
    public Optional<DatasetVersioningConfiguration> getVersioningConfiguration() {
        return Optional.ofNullable(this.versioningConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatasetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DatasetAction> actions;
        private @Nullable List<DatasetContentDeliveryRule> contentDeliveryRules;
        private @Nullable String id;
        private @Nullable List<DatasetLateDataRule> lateDataRules;
        private @Nullable DatasetRetentionPeriod retentionPeriod;
        private @Nullable List<DatasetTag> tags;
        private @Nullable List<DatasetTrigger> triggers;
        private @Nullable DatasetVersioningConfiguration versioningConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatasetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.contentDeliveryRules = defaults.contentDeliveryRules;
    	      this.id = defaults.id;
    	      this.lateDataRules = defaults.lateDataRules;
    	      this.retentionPeriod = defaults.retentionPeriod;
    	      this.tags = defaults.tags;
    	      this.triggers = defaults.triggers;
    	      this.versioningConfiguration = defaults.versioningConfiguration;
        }

        public Builder setActions(@Nullable List<DatasetAction> actions) {
            this.actions = actions;
            return this;
        }

        public Builder setContentDeliveryRules(@Nullable List<DatasetContentDeliveryRule> contentDeliveryRules) {
            this.contentDeliveryRules = contentDeliveryRules;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setLateDataRules(@Nullable List<DatasetLateDataRule> lateDataRules) {
            this.lateDataRules = lateDataRules;
            return this;
        }

        public Builder setRetentionPeriod(@Nullable DatasetRetentionPeriod retentionPeriod) {
            this.retentionPeriod = retentionPeriod;
            return this;
        }

        public Builder setTags(@Nullable List<DatasetTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTriggers(@Nullable List<DatasetTrigger> triggers) {
            this.triggers = triggers;
            return this;
        }

        public Builder setVersioningConfiguration(@Nullable DatasetVersioningConfiguration versioningConfiguration) {
            this.versioningConfiguration = versioningConfiguration;
            return this;
        }
        public GetDatasetResult build() {
            return new GetDatasetResult(actions, contentDeliveryRules, id, lateDataRules, retentionPeriod, tags, triggers, versioningConfiguration);
        }
    }
}
