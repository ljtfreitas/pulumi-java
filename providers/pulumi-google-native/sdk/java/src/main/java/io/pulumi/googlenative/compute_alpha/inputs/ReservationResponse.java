// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.AllocationSpecificSKUReservationResponse;
import io.pulumi.googlenative.compute_alpha.inputs.ShareSettingsResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a reservation resource. A reservation ensures that capacity is held in a specific zone even if the reserved VMs are not running. For more information, read Reserving zonal resources.
 * 
 */
public final class ReservationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ReservationResponse Empty = new ReservationResponse();

    /**
     * Full or partial URL to a parent commitment. This field displays for reservations that are tied to a commitment.
     * 
     */
    @InputImport(name="commitment", required=true)
      private final String commitment;

    public String getCommitment() {
        return this.commitment;
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @InputImport(name="creationTimestamp", required=true)
      private final String creationTimestamp;

    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description", required=true)
      private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * Type of the resource. Always compute#reservations for reservations.
     * 
     */
    @InputImport(name="kind", required=true)
      private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Reserved for future use.
     * 
     */
    @InputImport(name="satisfiesPzs", required=true)
      private final Boolean satisfiesPzs;

    public Boolean getSatisfiesPzs() {
        return this.satisfiesPzs;
    }

    /**
     * Server-defined fully-qualified URL for this resource.
     * 
     */
    @InputImport(name="selfLink", required=true)
      private final String selfLink;

    public String getSelfLink() {
        return this.selfLink;
    }

    /**
     * Server-defined URL for this resource with the resource id.
     * 
     */
    @InputImport(name="selfLinkWithId", required=true)
      private final String selfLinkWithId;

    public String getSelfLinkWithId() {
        return this.selfLinkWithId;
    }

    /**
     * Share-settings for shared-reservation
     * 
     */
    @InputImport(name="shareSettings", required=true)
      private final ShareSettingsResponse shareSettings;

    public ShareSettingsResponse getShareSettings() {
        return this.shareSettings;
    }

    /**
     * Reservation for instances with specific machine shapes.
     * 
     */
    @InputImport(name="specificReservation", required=true)
      private final AllocationSpecificSKUReservationResponse specificReservation;

    public AllocationSpecificSKUReservationResponse getSpecificReservation() {
        return this.specificReservation;
    }

    /**
     * Indicates whether the reservation can be consumed by VMs with affinity for "any" reservation. If the field is set, then only VMs that target the reservation by name can consume from this reservation.
     * 
     */
    @InputImport(name="specificReservationRequired", required=true)
      private final Boolean specificReservationRequired;

    public Boolean getSpecificReservationRequired() {
        return this.specificReservationRequired;
    }

    /**
     * The status of the reservation.
     * 
     */
    @InputImport(name="status", required=true)
      private final String status;

    public String getStatus() {
        return this.status;
    }

    /**
     * Zone in which the reservation resides. A zone must be provided if the reservation is created within a commitment.
     * 
     */
    @InputImport(name="zone", required=true)
      private final String zone;

    public String getZone() {
        return this.zone;
    }

    public ReservationResponse(
        String commitment,
        String creationTimestamp,
        String description,
        String kind,
        String name,
        Boolean satisfiesPzs,
        String selfLink,
        String selfLinkWithId,
        ShareSettingsResponse shareSettings,
        AllocationSpecificSKUReservationResponse specificReservation,
        Boolean specificReservationRequired,
        String status,
        String zone) {
        this.commitment = Objects.requireNonNull(commitment, "expected parameter 'commitment' to be non-null");
        this.creationTimestamp = Objects.requireNonNull(creationTimestamp, "expected parameter 'creationTimestamp' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.satisfiesPzs = Objects.requireNonNull(satisfiesPzs, "expected parameter 'satisfiesPzs' to be non-null");
        this.selfLink = Objects.requireNonNull(selfLink, "expected parameter 'selfLink' to be non-null");
        this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId, "expected parameter 'selfLinkWithId' to be non-null");
        this.shareSettings = Objects.requireNonNull(shareSettings, "expected parameter 'shareSettings' to be non-null");
        this.specificReservation = Objects.requireNonNull(specificReservation, "expected parameter 'specificReservation' to be non-null");
        this.specificReservationRequired = Objects.requireNonNull(specificReservationRequired, "expected parameter 'specificReservationRequired' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.zone = Objects.requireNonNull(zone, "expected parameter 'zone' to be non-null");
    }

    private ReservationResponse() {
        this.commitment = null;
        this.creationTimestamp = null;
        this.description = null;
        this.kind = null;
        this.name = null;
        this.satisfiesPzs = null;
        this.selfLink = null;
        this.selfLinkWithId = null;
        this.shareSettings = null;
        this.specificReservation = null;
        this.specificReservationRequired = null;
        this.status = null;
        this.zone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String commitment;
        private String creationTimestamp;
        private String description;
        private String kind;
        private String name;
        private Boolean satisfiesPzs;
        private String selfLink;
        private String selfLinkWithId;
        private ShareSettingsResponse shareSettings;
        private AllocationSpecificSKUReservationResponse specificReservation;
        private Boolean specificReservationRequired;
        private String status;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commitment = defaults.commitment;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.satisfiesPzs = defaults.satisfiesPzs;
    	      this.selfLink = defaults.selfLink;
    	      this.selfLinkWithId = defaults.selfLinkWithId;
    	      this.shareSettings = defaults.shareSettings;
    	      this.specificReservation = defaults.specificReservation;
    	      this.specificReservationRequired = defaults.specificReservationRequired;
    	      this.status = defaults.status;
    	      this.zone = defaults.zone;
        }

        public Builder setCommitment(String commitment) {
            this.commitment = Objects.requireNonNull(commitment);
            return this;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSatisfiesPzs(Boolean satisfiesPzs) {
            this.satisfiesPzs = Objects.requireNonNull(satisfiesPzs);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setSelfLinkWithId(String selfLinkWithId) {
            this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
            return this;
        }

        public Builder setShareSettings(ShareSettingsResponse shareSettings) {
            this.shareSettings = Objects.requireNonNull(shareSettings);
            return this;
        }

        public Builder setSpecificReservation(AllocationSpecificSKUReservationResponse specificReservation) {
            this.specificReservation = Objects.requireNonNull(specificReservation);
            return this;
        }

        public Builder setSpecificReservationRequired(Boolean specificReservationRequired) {
            this.specificReservationRequired = Objects.requireNonNull(specificReservationRequired);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setZone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }
        public ReservationResponse build() {
            return new ReservationResponse(commitment, creationTimestamp, description, kind, name, satisfiesPzs, selfLink, selfLinkWithId, shareSettings, specificReservation, specificReservationRequired, status, zone);
        }
    }
}
