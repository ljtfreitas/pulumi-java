// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mediaconvert;

import io.pulumi.aws.mediaconvert.inputs.QueueReservationPlanSettingsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QueueArgs extends io.pulumi.resources.ResourceArgs {

    public static final QueueArgs Empty = new QueueArgs();

    /**
     * A description of the queue
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * A unique identifier describing the queue
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Specifies whether the pricing plan for the queue is on-demand or reserved. Valid values are `ON_DEMAND` or `RESERVED`. Default to `ON_DEMAND`.
     * 
     */
    @Import(name="pricingPlan")
      private final @Nullable Output<String> pricingPlan;

    public Output<String> getPricingPlan() {
        return this.pricingPlan == null ? Output.empty() : this.pricingPlan;
    }

    /**
     * A detail pricing plan of the  reserved queue. See below.
     * 
     */
    @Import(name="reservationPlanSettings")
      private final @Nullable Output<QueueReservationPlanSettingsArgs> reservationPlanSettings;

    public Output<QueueReservationPlanSettingsArgs> getReservationPlanSettings() {
        return this.reservationPlanSettings == null ? Output.empty() : this.reservationPlanSettings;
    }

    /**
     * A status of the queue. Valid values are `ACTIVE` or `RESERVED`. Default to `PAUSED`.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public QueueArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<String> pricingPlan,
        @Nullable Output<QueueReservationPlanSettingsArgs> reservationPlanSettings,
        @Nullable Output<String> status,
        @Nullable Output<Map<String,String>> tags) {
        this.description = description;
        this.name = name;
        this.pricingPlan = pricingPlan;
        this.reservationPlanSettings = reservationPlanSettings;
        this.status = status;
        this.tags = tags;
    }

    private QueueArgs() {
        this.description = Output.empty();
        this.name = Output.empty();
        this.pricingPlan = Output.empty();
        this.reservationPlanSettings = Output.empty();
        this.status = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<String> pricingPlan;
        private @Nullable Output<QueueReservationPlanSettingsArgs> reservationPlanSettings;
        private @Nullable Output<String> status;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(QueueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.pricingPlan = defaults.pricingPlan;
    	      this.reservationPlanSettings = defaults.reservationPlanSettings;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
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

        public Builder pricingPlan(@Nullable Output<String> pricingPlan) {
            this.pricingPlan = pricingPlan;
            return this;
        }

        public Builder pricingPlan(@Nullable String pricingPlan) {
            this.pricingPlan = Output.ofNullable(pricingPlan);
            return this;
        }

        public Builder reservationPlanSettings(@Nullable Output<QueueReservationPlanSettingsArgs> reservationPlanSettings) {
            this.reservationPlanSettings = reservationPlanSettings;
            return this;
        }

        public Builder reservationPlanSettings(@Nullable QueueReservationPlanSettingsArgs reservationPlanSettings) {
            this.reservationPlanSettings = Output.ofNullable(reservationPlanSettings);
            return this;
        }

        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = Output.ofNullable(status);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public QueueArgs build() {
            return new QueueArgs(description, name, pricingPlan, reservationPlanSettings, status, tags);
        }
    }
}
