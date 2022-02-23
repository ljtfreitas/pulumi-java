// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.azurenative.devtestlab.outputs.UserIdentityResponse;
import io.pulumi.azurenative.devtestlab.outputs.UserSecretStoreResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetUserResult {
    /**
     * The creation date of the user profile.
     * 
     */
    private final String createdDate;
    /**
     * The identifier of the resource.
     * 
     */
    private final String id;
    /**
     * The identity of the user.
     * 
     */
    private final @Nullable UserIdentityResponse identity;
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
    private final String provisioningState;
    /**
     * The secret store of the user.
     * 
     */
    private final @Nullable UserSecretStoreResponse secretStore;
    /**
     * The tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource.
     * 
     */
    private final String type;
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    private final String uniqueIdentifier;

    @OutputCustomType.Constructor({"createdDate","id","identity","location","name","provisioningState","secretStore","tags","type","uniqueIdentifier"})
    private GetUserResult(
        String createdDate,
        String id,
        @Nullable UserIdentityResponse identity,
        @Nullable String location,
        String name,
        String provisioningState,
        @Nullable UserSecretStoreResponse secretStore,
        @Nullable Map<String,String> tags,
        String type,
        String uniqueIdentifier) {
        this.createdDate = Objects.requireNonNull(createdDate);
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.secretStore = secretStore;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.uniqueIdentifier = Objects.requireNonNull(uniqueIdentifier);
    }

    /**
     * The creation date of the user profile.
     * 
     */
    public String getCreatedDate() {
        return this.createdDate;
    }
    /**
     * The identifier of the resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The identity of the user.
     * 
     */
    public Optional<UserIdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
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
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The secret store of the user.
     * 
     */
    public Optional<UserSecretStoreResponse> getSecretStore() {
        return Optional.ofNullable(this.secretStore);
    }
    /**
     * The tags of the resource.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
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
    public String getUniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdDate;
        private String id;
        private @Nullable UserIdentityResponse identity;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private @Nullable UserSecretStoreResponse secretStore;
        private @Nullable Map<String,String> tags;
        private String type;
        private String uniqueIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdDate = defaults.createdDate;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.secretStore = defaults.secretStore;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.uniqueIdentifier = defaults.uniqueIdentifier;
        }

        public Builder setCreatedDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable UserIdentityResponse identity) {
            this.identity = identity;
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

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSecretStore(@Nullable UserSecretStoreResponse secretStore) {
            this.secretStore = secretStore;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUniqueIdentifier(String uniqueIdentifier) {
            this.uniqueIdentifier = Objects.requireNonNull(uniqueIdentifier);
            return this;
        }
        public GetUserResult build() {
            return new GetUserResult(createdDate, id, identity, location, name, provisioningState, secretStore, tags, type, uniqueIdentifier);
        }
    }
}
