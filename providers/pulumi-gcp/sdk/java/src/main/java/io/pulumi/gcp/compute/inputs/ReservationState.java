// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.ReservationShareSettingsGetArgs;
import io.pulumi.gcp.compute.inputs.ReservationSpecificReservationGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReservationState extends io.pulumi.resources.ResourceArgs {

    public static final ReservationState Empty = new ReservationState();

    /**
     * Full or partial URL to a parent commitment. This field displays for reservations that are tied to a commitment.
     * 
     */
    @Import(name="commitment")
      private final @Nullable Output<String> commitment;

    public Output<String> commitment() {
        return this.commitment == null ? Codegen.empty() : this.commitment;
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Import(name="creationTimestamp")
      private final @Nullable Output<String> creationTimestamp;

    public Output<String> creationTimestamp() {
        return this.creationTimestamp == null ? Codegen.empty() : this.creationTimestamp;
    }

    /**
     * An optional description of this resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
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
     * The URI of the created resource.
     * 
     */
    @Import(name="selfLink")
      private final @Nullable Output<String> selfLink;

    public Output<String> selfLink() {
        return this.selfLink == null ? Codegen.empty() : this.selfLink;
    }

    /**
     * The share setting for reservations.
     * Structure is documented below.
     * 
     */
    @Import(name="shareSettings")
      private final @Nullable Output<ReservationShareSettingsGetArgs> shareSettings;

    public Output<ReservationShareSettingsGetArgs> shareSettings() {
        return this.shareSettings == null ? Codegen.empty() : this.shareSettings;
    }

    /**
     * Reservation for instances with specific machine shapes.
     * Structure is documented below.
     * 
     */
    @Import(name="specificReservation")
      private final @Nullable Output<ReservationSpecificReservationGetArgs> specificReservation;

    public Output<ReservationSpecificReservationGetArgs> specificReservation() {
        return this.specificReservation == null ? Codegen.empty() : this.specificReservation;
    }

    /**
     * When set to true, only VMs that target this reservation by name can
     * consume this reservation. Otherwise, it can be consumed by VMs with
     * affinity for any reservation. Defaults to false.
     * 
     */
    @Import(name="specificReservationRequired")
      private final @Nullable Output<Boolean> specificReservationRequired;

    public Output<Boolean> specificReservationRequired() {
        return this.specificReservationRequired == null ? Codegen.empty() : this.specificReservationRequired;
    }

    /**
     * The status of the reservation.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    /**
     * The zone where the reservation is made.
     * 
     */
    @Import(name="zone")
      private final @Nullable Output<String> zone;

    public Output<String> zone() {
        return this.zone == null ? Codegen.empty() : this.zone;
    }

    public ReservationState(
        @Nullable Output<String> commitment,
        @Nullable Output<String> creationTimestamp,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> selfLink,
        @Nullable Output<ReservationShareSettingsGetArgs> shareSettings,
        @Nullable Output<ReservationSpecificReservationGetArgs> specificReservation,
        @Nullable Output<Boolean> specificReservationRequired,
        @Nullable Output<String> status,
        @Nullable Output<String> zone) {
        this.commitment = commitment;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.name = name;
        this.project = project;
        this.selfLink = selfLink;
        this.shareSettings = shareSettings;
        this.specificReservation = specificReservation;
        this.specificReservationRequired = specificReservationRequired;
        this.status = status;
        this.zone = zone;
    }

    private ReservationState() {
        this.commitment = Codegen.empty();
        this.creationTimestamp = Codegen.empty();
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.selfLink = Codegen.empty();
        this.shareSettings = Codegen.empty();
        this.specificReservation = Codegen.empty();
        this.specificReservationRequired = Codegen.empty();
        this.status = Codegen.empty();
        this.zone = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> commitment;
        private @Nullable Output<String> creationTimestamp;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> selfLink;
        private @Nullable Output<ReservationShareSettingsGetArgs> shareSettings;
        private @Nullable Output<ReservationSpecificReservationGetArgs> specificReservation;
        private @Nullable Output<Boolean> specificReservationRequired;
        private @Nullable Output<String> status;
        private @Nullable Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commitment = defaults.commitment;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
    	      this.shareSettings = defaults.shareSettings;
    	      this.specificReservation = defaults.specificReservation;
    	      this.specificReservationRequired = defaults.specificReservationRequired;
    	      this.status = defaults.status;
    	      this.zone = defaults.zone;
        }

        public Builder commitment(@Nullable Output<String> commitment) {
            this.commitment = commitment;
            return this;
        }
        public Builder commitment(@Nullable String commitment) {
            this.commitment = Codegen.ofNullable(commitment);
            return this;
        }
        public Builder creationTimestamp(@Nullable Output<String> creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }
        public Builder creationTimestamp(@Nullable String creationTimestamp) {
            this.creationTimestamp = Codegen.ofNullable(creationTimestamp);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
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
        public Builder selfLink(@Nullable Output<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }
        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = Codegen.ofNullable(selfLink);
            return this;
        }
        public Builder shareSettings(@Nullable Output<ReservationShareSettingsGetArgs> shareSettings) {
            this.shareSettings = shareSettings;
            return this;
        }
        public Builder shareSettings(@Nullable ReservationShareSettingsGetArgs shareSettings) {
            this.shareSettings = Codegen.ofNullable(shareSettings);
            return this;
        }
        public Builder specificReservation(@Nullable Output<ReservationSpecificReservationGetArgs> specificReservation) {
            this.specificReservation = specificReservation;
            return this;
        }
        public Builder specificReservation(@Nullable ReservationSpecificReservationGetArgs specificReservation) {
            this.specificReservation = Codegen.ofNullable(specificReservation);
            return this;
        }
        public Builder specificReservationRequired(@Nullable Output<Boolean> specificReservationRequired) {
            this.specificReservationRequired = specificReservationRequired;
            return this;
        }
        public Builder specificReservationRequired(@Nullable Boolean specificReservationRequired) {
            this.specificReservationRequired = Codegen.ofNullable(specificReservationRequired);
            return this;
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }
        public Builder zone(@Nullable Output<String> zone) {
            this.zone = zone;
            return this;
        }
        public Builder zone(@Nullable String zone) {
            this.zone = Codegen.ofNullable(zone);
            return this;
        }        public ReservationState build() {
            return new ReservationState(commitment, creationTimestamp, description, name, project, selfLink, shareSettings, specificReservation, specificReservationRequired, status, zone);
        }
    }
}
