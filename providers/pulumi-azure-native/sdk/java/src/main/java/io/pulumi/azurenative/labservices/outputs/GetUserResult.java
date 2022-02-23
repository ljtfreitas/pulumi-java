// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.outputs;

import io.pulumi.azurenative.labservices.outputs.LatestOperationResultResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetUserResult {
    /**
     * The user email address, as it was specified during registration.
     * 
     */
    private final String email;
    /**
     * The user family name, as it was specified during registration.
     * 
     */
    private final String familyName;
    /**
     * The user given name, as it was specified during registration.
     * 
     */
    private final String givenName;
    /**
     * The identifier of the resource.
     * 
     */
    private final String id;
    /**
     * The details of the latest operation. ex: status, error
     * 
     */
    private final LatestOperationResultResponse latestOperationResult;
    /**
     * The location of the resource.
     * 
     */
    private final @Nullable String location;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * The provisioning status of the resource.
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * The tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The user tenant ID, as it was specified during registration.
     * 
     */
    private final String tenantId;
    /**
     * How long the user has used his VMs in this lab
     * 
     */
    private final String totalUsage;
    /**
     * The type of the resource.
     * 
     */
    private final String type;
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    private final @Nullable String uniqueIdentifier;

    @OutputCustomType.Constructor({"email","familyName","givenName","id","latestOperationResult","location","name","provisioningState","tags","tenantId","totalUsage","type","uniqueIdentifier"})
    private GetUserResult(
        String email,
        String familyName,
        String givenName,
        String id,
        LatestOperationResultResponse latestOperationResult,
        @Nullable String location,
        String name,
        @Nullable String provisioningState,
        @Nullable Map<String,String> tags,
        String tenantId,
        String totalUsage,
        String type,
        @Nullable String uniqueIdentifier) {
        this.email = Objects.requireNonNull(email);
        this.familyName = Objects.requireNonNull(familyName);
        this.givenName = Objects.requireNonNull(givenName);
        this.id = Objects.requireNonNull(id);
        this.latestOperationResult = Objects.requireNonNull(latestOperationResult);
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.provisioningState = provisioningState;
        this.tags = tags;
        this.tenantId = Objects.requireNonNull(tenantId);
        this.totalUsage = Objects.requireNonNull(totalUsage);
        this.type = Objects.requireNonNull(type);
        this.uniqueIdentifier = uniqueIdentifier;
    }

    /**
     * The user email address, as it was specified during registration.
     * 
     */
    public String getEmail() {
        return this.email;
    }
    /**
     * The user family name, as it was specified during registration.
     * 
     */
    public String getFamilyName() {
        return this.familyName;
    }
    /**
     * The user given name, as it was specified during registration.
     * 
     */
    public String getGivenName() {
        return this.givenName;
    }
    /**
     * The identifier of the resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The details of the latest operation. ex: status, error
     * 
     */
    public LatestOperationResultResponse getLatestOperationResult() {
        return this.latestOperationResult;
    }
    /**
     * The location of the resource.
     * 
     */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The name of the resource.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The provisioning status of the resource.
     * 
     */
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * The tags of the resource.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The user tenant ID, as it was specified during registration.
     * 
     */
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * How long the user has used his VMs in this lab
     * 
     */
    public String getTotalUsage() {
        return this.totalUsage;
    }
    /**
     * The type of the resource.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    public Optional<String> getUniqueIdentifier() {
        return Optional.ofNullable(this.uniqueIdentifier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String email;
        private String familyName;
        private String givenName;
        private String id;
        private LatestOperationResultResponse latestOperationResult;
        private @Nullable String location;
        private String name;
        private @Nullable String provisioningState;
        private @Nullable Map<String,String> tags;
        private String tenantId;
        private String totalUsage;
        private String type;
        private @Nullable String uniqueIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.familyName = defaults.familyName;
    	      this.givenName = defaults.givenName;
    	      this.id = defaults.id;
    	      this.latestOperationResult = defaults.latestOperationResult;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.tags = defaults.tags;
    	      this.tenantId = defaults.tenantId;
    	      this.totalUsage = defaults.totalUsage;
    	      this.type = defaults.type;
    	      this.uniqueIdentifier = defaults.uniqueIdentifier;
        }

        public Builder setEmail(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }

        public Builder setFamilyName(String familyName) {
            this.familyName = Objects.requireNonNull(familyName);
            return this;
        }

        public Builder setGivenName(String givenName) {
            this.givenName = Objects.requireNonNull(givenName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLatestOperationResult(LatestOperationResultResponse latestOperationResult) {
            this.latestOperationResult = Objects.requireNonNull(latestOperationResult);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder setTotalUsage(String totalUsage) {
            this.totalUsage = Objects.requireNonNull(totalUsage);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUniqueIdentifier(@Nullable String uniqueIdentifier) {
            this.uniqueIdentifier = uniqueIdentifier;
            return this;
        }
        public GetUserResult build() {
            return new GetUserResult(email, familyName, givenName, id, latestOperationResult, location, name, provisioningState, tags, tenantId, totalUsage, type, uniqueIdentifier);
        }
    }
}
