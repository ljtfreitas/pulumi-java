// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.outposts.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetOutpostsResult {
    /**
     * Set of Amazon Resource Names (ARNs).
     * 
     */
    private final List<String> arns;
    private final String availabilityZone;
    private final String availabilityZoneId;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Set of identifiers.
     * 
     */
    private final List<String> ids;
    private final String ownerId;
    private final String siteId;

    @CustomType.Constructor
    private GetOutpostsResult(
        @CustomType.Parameter("arns") List<String> arns,
        @CustomType.Parameter("availabilityZone") String availabilityZone,
        @CustomType.Parameter("availabilityZoneId") String availabilityZoneId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("ownerId") String ownerId,
        @CustomType.Parameter("siteId") String siteId) {
        this.arns = arns;
        this.availabilityZone = availabilityZone;
        this.availabilityZoneId = availabilityZoneId;
        this.id = id;
        this.ids = ids;
        this.ownerId = ownerId;
        this.siteId = siteId;
    }

    /**
     * Set of Amazon Resource Names (ARNs).
     * 
    */
    public List<String> getArns() {
        return this.arns;
    }
    public String getAvailabilityZone() {
        return this.availabilityZone;
    }
    public String getAvailabilityZoneId() {
        return this.availabilityZoneId;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Set of identifiers.
     * 
    */
    public List<String> getIds() {
        return this.ids;
    }
    public String getOwnerId() {
        return this.ownerId;
    }
    public String getSiteId() {
        return this.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOutpostsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> arns;
        private String availabilityZone;
        private String availabilityZoneId;
        private String id;
        private List<String> ids;
        private String ownerId;
        private String siteId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOutpostsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arns = defaults.arns;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.availabilityZoneId = defaults.availabilityZoneId;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.ownerId = defaults.ownerId;
    	      this.siteId = defaults.siteId;
        }

        public Builder arns(List<String> arns) {
            this.arns = Objects.requireNonNull(arns);
            return this;
        }

        public Builder availabilityZone(String availabilityZone) {
            this.availabilityZone = Objects.requireNonNull(availabilityZone);
            return this;
        }

        public Builder availabilityZoneId(String availabilityZoneId) {
            this.availabilityZoneId = Objects.requireNonNull(availabilityZoneId);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }

        public Builder ownerId(String ownerId) {
            this.ownerId = Objects.requireNonNull(ownerId);
            return this;
        }

        public Builder siteId(String siteId) {
            this.siteId = Objects.requireNonNull(siteId);
            return this;
        }
        public GetOutpostsResult build() {
            return new GetOutpostsResult(arns, availabilityZone, availabilityZoneId, id, ids, ownerId, siteId);
        }
    }
}
