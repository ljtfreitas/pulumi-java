// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mixedreality.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSpatialAnchorsAccountResult {
    /**
     * @return The domain of the Spatial Anchors Account.
     * 
     */
    private final String accountDomain;
    /**
     * @return The account ID of the Spatial Anchors Account.
     * 
     */
    private final String accountId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String location;
    private final String name;
    private final String resourceGroupName;

    @CustomType.Constructor
    private GetSpatialAnchorsAccountResult(
        @CustomType.Parameter("accountDomain") String accountDomain,
        @CustomType.Parameter("accountId") String accountId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName) {
        this.accountDomain = accountDomain;
        this.accountId = accountId;
        this.id = id;
        this.location = location;
        this.name = name;
        this.resourceGroupName = resourceGroupName;
    }

    /**
     * @return The domain of the Spatial Anchors Account.
     * 
     */
    public String accountDomain() {
        return this.accountDomain;
    }
    /**
     * @return The account ID of the Spatial Anchors Account.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String location() {
        return this.location;
    }
    public String name() {
        return this.name;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSpatialAnchorsAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountDomain;
        private String accountId;
        private String id;
        private String location;
        private String name;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSpatialAnchorsAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountDomain = defaults.accountDomain;
    	      this.accountId = defaults.accountId;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder accountDomain(String accountDomain) {
            this.accountDomain = Objects.requireNonNull(accountDomain);
            return this;
        }
        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetSpatialAnchorsAccountResult build() {
            return new GetSpatialAnchorsAccountResult(accountDomain, accountId, id, location, name, resourceGroupName);
        }
    }
}
