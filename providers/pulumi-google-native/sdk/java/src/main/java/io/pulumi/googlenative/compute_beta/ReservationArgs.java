// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.inputs.AllocationSpecificSKUReservationArgs;
import io.pulumi.googlenative.compute_beta.inputs.ShareSettingsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReservationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReservationArgs Empty = new ReservationArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="requestId")
      private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * Share-settings for shared-reservation
     * 
     */
    @InputImport(name="shareSettings")
      private final @Nullable Input<ShareSettingsArgs> shareSettings;

    public Input<ShareSettingsArgs> getShareSettings() {
        return this.shareSettings == null ? Input.empty() : this.shareSettings;
    }

    /**
     * Reservation for instances with specific machine shapes.
     * 
     */
    @InputImport(name="specificReservation")
      private final @Nullable Input<AllocationSpecificSKUReservationArgs> specificReservation;

    public Input<AllocationSpecificSKUReservationArgs> getSpecificReservation() {
        return this.specificReservation == null ? Input.empty() : this.specificReservation;
    }

    /**
     * Indicates whether the reservation can be consumed by VMs with affinity for "any" reservation. If the field is set, then only VMs that target the reservation by name can consume from this reservation.
     * 
     */
    @InputImport(name="specificReservationRequired")
      private final @Nullable Input<Boolean> specificReservationRequired;

    public Input<Boolean> getSpecificReservationRequired() {
        return this.specificReservationRequired == null ? Input.empty() : this.specificReservationRequired;
    }

    /**
     * Zone in which the reservation resides. A zone must be provided if the reservation is created within a commitment.
     * 
     */
    @InputImport(name="zone")
      private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public ReservationArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> requestId,
        @Nullable Input<ShareSettingsArgs> shareSettings,
        @Nullable Input<AllocationSpecificSKUReservationArgs> specificReservation,
        @Nullable Input<Boolean> specificReservationRequired,
        @Nullable Input<String> zone) {
        this.description = description;
        this.name = name;
        this.project = project;
        this.requestId = requestId;
        this.shareSettings = shareSettings;
        this.specificReservation = specificReservation;
        this.specificReservationRequired = specificReservationRequired;
        this.zone = zone;
    }

    private ReservationArgs() {
        this.description = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.requestId = Input.empty();
        this.shareSettings = Input.empty();
        this.specificReservation = Input.empty();
        this.specificReservationRequired = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> requestId;
        private @Nullable Input<ShareSettingsArgs> shareSettings;
        private @Nullable Input<AllocationSpecificSKUReservationArgs> specificReservation;
        private @Nullable Input<Boolean> specificReservationRequired;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.shareSettings = defaults.shareSettings;
    	      this.specificReservation = defaults.specificReservation;
    	      this.specificReservationRequired = defaults.specificReservationRequired;
    	      this.zone = defaults.zone;
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

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setShareSettings(@Nullable Input<ShareSettingsArgs> shareSettings) {
            this.shareSettings = shareSettings;
            return this;
        }

        public Builder setShareSettings(@Nullable ShareSettingsArgs shareSettings) {
            this.shareSettings = Input.ofNullable(shareSettings);
            return this;
        }

        public Builder setSpecificReservation(@Nullable Input<AllocationSpecificSKUReservationArgs> specificReservation) {
            this.specificReservation = specificReservation;
            return this;
        }

        public Builder setSpecificReservation(@Nullable AllocationSpecificSKUReservationArgs specificReservation) {
            this.specificReservation = Input.ofNullable(specificReservation);
            return this;
        }

        public Builder setSpecificReservationRequired(@Nullable Input<Boolean> specificReservationRequired) {
            this.specificReservationRequired = specificReservationRequired;
            return this;
        }

        public Builder setSpecificReservationRequired(@Nullable Boolean specificReservationRequired) {
            this.specificReservationRequired = Input.ofNullable(specificReservationRequired);
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
        public ReservationArgs build() {
            return new ReservationArgs(description, name, project, requestId, shareSettings, specificReservation, specificReservationRequired, zone);
        }
    }
}
