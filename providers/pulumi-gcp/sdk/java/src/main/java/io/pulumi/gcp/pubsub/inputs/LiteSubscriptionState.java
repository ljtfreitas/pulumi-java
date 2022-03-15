// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.pubsub.inputs.LiteSubscriptionDeliveryConfigGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LiteSubscriptionState extends io.pulumi.resources.ResourceArgs {

    public static final LiteSubscriptionState Empty = new LiteSubscriptionState();

    /**
     * The settings for this subscription's message delivery.
     * Structure is documented below.
     * 
     */
    @Import(name="deliveryConfig")
      private final @Nullable Output<LiteSubscriptionDeliveryConfigGetArgs> deliveryConfig;

    public Output<LiteSubscriptionDeliveryConfigGetArgs> getDeliveryConfig() {
        return this.deliveryConfig == null ? Output.empty() : this.deliveryConfig;
    }

    /**
     * Name of the subscription.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The region of the pubsub lite topic.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Output.empty() : this.region;
    }

    /**
     * A reference to a Topic resource.
     * 
     */
    @Import(name="topic")
      private final @Nullable Output<String> topic;

    public Output<String> getTopic() {
        return this.topic == null ? Output.empty() : this.topic;
    }

    /**
     * The zone of the pubsub lite topic.
     * 
     */
    @Import(name="zone")
      private final @Nullable Output<String> zone;

    public Output<String> getZone() {
        return this.zone == null ? Output.empty() : this.zone;
    }

    public LiteSubscriptionState(
        @Nullable Output<LiteSubscriptionDeliveryConfigGetArgs> deliveryConfig,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        @Nullable Output<String> topic,
        @Nullable Output<String> zone) {
        this.deliveryConfig = deliveryConfig;
        this.name = name;
        this.project = project;
        this.region = region;
        this.topic = topic;
        this.zone = zone;
    }

    private LiteSubscriptionState() {
        this.deliveryConfig = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.region = Output.empty();
        this.topic = Output.empty();
        this.zone = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiteSubscriptionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<LiteSubscriptionDeliveryConfigGetArgs> deliveryConfig;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private @Nullable Output<String> topic;
        private @Nullable Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(LiteSubscriptionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deliveryConfig = defaults.deliveryConfig;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.topic = defaults.topic;
    	      this.zone = defaults.zone;
        }

        public Builder deliveryConfig(@Nullable Output<LiteSubscriptionDeliveryConfigGetArgs> deliveryConfig) {
            this.deliveryConfig = deliveryConfig;
            return this;
        }

        public Builder deliveryConfig(@Nullable LiteSubscriptionDeliveryConfigGetArgs deliveryConfig) {
            this.deliveryConfig = Output.ofNullable(deliveryConfig);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = Output.ofNullable(region);
            return this;
        }

        public Builder topic(@Nullable Output<String> topic) {
            this.topic = topic;
            return this;
        }

        public Builder topic(@Nullable String topic) {
            this.topic = Output.ofNullable(topic);
            return this;
        }

        public Builder zone(@Nullable Output<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder zone(@Nullable String zone) {
            this.zone = Output.ofNullable(zone);
            return this;
        }
        public LiteSubscriptionState build() {
            return new LiteSubscriptionState(deliveryConfig, name, project, region, topic, zone);
        }
    }
}
