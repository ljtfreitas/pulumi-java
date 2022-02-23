// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mediaconvert;

import io.pulumi.aws.mediaconvert.inputs.QueueReservationPlanSettingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
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
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * A unique identifier describing the queue
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Specifies whether the pricing plan for the queue is on-demand or reserved. Valid values are `ON_DEMAND` or `RESERVED`. Default to `ON_DEMAND`.
     * 
     */
    @InputImport(name="pricingPlan")
    private final @Nullable Input<String> pricingPlan;

    public Input<String> getPricingPlan() {
        return this.pricingPlan == null ? Input.empty() : this.pricingPlan;
    }

    /**
     * A detail pricing plan of the  reserved queue. See below.
     * 
     */
    @InputImport(name="reservationPlanSettings")
    private final @Nullable Input<QueueReservationPlanSettingsArgs> reservationPlanSettings;

    public Input<QueueReservationPlanSettingsArgs> getReservationPlanSettings() {
        return this.reservationPlanSettings == null ? Input.empty() : this.reservationPlanSettings;
    }

    /**
     * A status of the queue. Valid values are `ACTIVE` or `RESERVED`. Default to `PAUSED`.
     * 
     */
    @InputImport(name="status")
    private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public QueueArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<String> pricingPlan,
        @Nullable Input<QueueReservationPlanSettingsArgs> reservationPlanSettings,
        @Nullable Input<String> status,
        @Nullable Input<Map<String,String>> tags) {
        this.description = description;
        this.name = name;
        this.pricingPlan = pricingPlan;
        this.reservationPlanSettings = reservationPlanSettings;
        this.status = status;
        this.tags = tags;
    }

    private QueueArgs() {
        this.description = Input.empty();
        this.name = Input.empty();
        this.pricingPlan = Input.empty();
        this.reservationPlanSettings = Input.empty();
        this.status = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<String> pricingPlan;
        private @Nullable Input<QueueReservationPlanSettingsArgs> reservationPlanSettings;
        private @Nullable Input<String> status;
        private @Nullable Input<Map<String,String>> tags;

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

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPricingPlan(@Nullable Input<String> pricingPlan) {
            this.pricingPlan = pricingPlan;
            return this;
        }

        public Builder setPricingPlan(@Nullable String pricingPlan) {
            this.pricingPlan = Input.ofNullable(pricingPlan);
            return this;
        }

        public Builder setReservationPlanSettings(@Nullable Input<QueueReservationPlanSettingsArgs> reservationPlanSettings) {
            this.reservationPlanSettings = reservationPlanSettings;
            return this;
        }

        public Builder setReservationPlanSettings(@Nullable QueueReservationPlanSettingsArgs reservationPlanSettings) {
            this.reservationPlanSettings = Input.ofNullable(reservationPlanSettings);
            return this;
        }

        public Builder setStatus(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public QueueArgs build() {
            return new QueueArgs(description, name, pricingPlan, reservationPlanSettings, status, tags);
        }
    }
}
