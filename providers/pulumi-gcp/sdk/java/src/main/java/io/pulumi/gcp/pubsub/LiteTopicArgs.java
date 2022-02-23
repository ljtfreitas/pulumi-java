// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.pubsub.inputs.LiteTopicPartitionConfigArgs;
import io.pulumi.gcp.pubsub.inputs.LiteTopicReservationConfigArgs;
import io.pulumi.gcp.pubsub.inputs.LiteTopicRetentionConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LiteTopicArgs extends io.pulumi.resources.ResourceArgs {

    public static final LiteTopicArgs Empty = new LiteTopicArgs();

    /**
     * Name of the topic.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The settings for this topic's partitions.
     * Structure is documented below.
     * 
     */
    @InputImport(name="partitionConfig")
        private final @Nullable Input<LiteTopicPartitionConfigArgs> partitionConfig;

    public Input<LiteTopicPartitionConfigArgs> getPartitionConfig() {
        return this.partitionConfig == null ? Input.empty() : this.partitionConfig;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
        private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The region of the pubsub lite topic.
     * 
     */
    @InputImport(name="region")
        private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * The settings for this topic's Reservation usage.
     * Structure is documented below.
     * 
     */
    @InputImport(name="reservationConfig")
        private final @Nullable Input<LiteTopicReservationConfigArgs> reservationConfig;

    public Input<LiteTopicReservationConfigArgs> getReservationConfig() {
        return this.reservationConfig == null ? Input.empty() : this.reservationConfig;
    }

    /**
     * The settings for a topic's message retention.
     * Structure is documented below.
     * 
     */
    @InputImport(name="retentionConfig")
        private final @Nullable Input<LiteTopicRetentionConfigArgs> retentionConfig;

    public Input<LiteTopicRetentionConfigArgs> getRetentionConfig() {
        return this.retentionConfig == null ? Input.empty() : this.retentionConfig;
    }

    /**
     * The zone of the pubsub lite topic.
     * 
     */
    @InputImport(name="zone")
        private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public LiteTopicArgs(
        @Nullable Input<String> name,
        @Nullable Input<LiteTopicPartitionConfigArgs> partitionConfig,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        @Nullable Input<LiteTopicReservationConfigArgs> reservationConfig,
        @Nullable Input<LiteTopicRetentionConfigArgs> retentionConfig,
        @Nullable Input<String> zone) {
        this.name = name;
        this.partitionConfig = partitionConfig;
        this.project = project;
        this.region = region;
        this.reservationConfig = reservationConfig;
        this.retentionConfig = retentionConfig;
        this.zone = zone;
    }

    private LiteTopicArgs() {
        this.name = Input.empty();
        this.partitionConfig = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.reservationConfig = Input.empty();
        this.retentionConfig = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiteTopicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<LiteTopicPartitionConfigArgs> partitionConfig;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private @Nullable Input<LiteTopicReservationConfigArgs> reservationConfig;
        private @Nullable Input<LiteTopicRetentionConfigArgs> retentionConfig;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(LiteTopicArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.partitionConfig = defaults.partitionConfig;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.reservationConfig = defaults.reservationConfig;
    	      this.retentionConfig = defaults.retentionConfig;
    	      this.zone = defaults.zone;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPartitionConfig(@Nullable Input<LiteTopicPartitionConfigArgs> partitionConfig) {
            this.partitionConfig = partitionConfig;
            return this;
        }

        public Builder setPartitionConfig(@Nullable LiteTopicPartitionConfigArgs partitionConfig) {
            this.partitionConfig = Input.ofNullable(partitionConfig);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder setReservationConfig(@Nullable Input<LiteTopicReservationConfigArgs> reservationConfig) {
            this.reservationConfig = reservationConfig;
            return this;
        }

        public Builder setReservationConfig(@Nullable LiteTopicReservationConfigArgs reservationConfig) {
            this.reservationConfig = Input.ofNullable(reservationConfig);
            return this;
        }

        public Builder setRetentionConfig(@Nullable Input<LiteTopicRetentionConfigArgs> retentionConfig) {
            this.retentionConfig = retentionConfig;
            return this;
        }

        public Builder setRetentionConfig(@Nullable LiteTopicRetentionConfigArgs retentionConfig) {
            this.retentionConfig = Input.ofNullable(retentionConfig);
            return this;
        }

        public Builder setZone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }
        public LiteTopicArgs build() {
            return new LiteTopicArgs(name, partitionConfig, project, region, reservationConfig, retentionConfig, zone);
        }
    }
}
