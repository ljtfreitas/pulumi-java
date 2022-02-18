// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Static Site User ARM resource.
 * 
 */
public final class StaticSiteUserARMResourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final StaticSiteUserARMResourceResponse Empty = new StaticSiteUserARMResourceResponse();

    /**
     * The display name for the static site user.
     * 
     */
    @InputImport(name="displayName", required=true)
    private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Resource Id.
     * 
     */
    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * Kind of resource.
     * 
     */
    @InputImport(name="kind")
    private final @Nullable String kind;

    public Optional<String> getKind() {
        return this.kind == null ? Optional.empty() : Optional.ofNullable(this.kind);
    }

    /**
     * Resource Name.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The identity provider for the static site user.
     * 
     */
    @InputImport(name="provider", required=true)
    private final String provider;

    public String getProvider() {
        return this.provider;
    }

    /**
     * The roles for the static site user, in free-form string format
     * 
     */
    @InputImport(name="roles")
    private final @Nullable String roles;

    public Optional<String> getRoles() {
        return this.roles == null ? Optional.empty() : Optional.ofNullable(this.roles);
    }

    /**
     * Resource type.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * The user id for the static site user.
     * 
     */
    @InputImport(name="userId", required=true)
    private final String userId;

    public String getUserId() {
        return this.userId;
    }

    public StaticSiteUserARMResourceResponse(
        String displayName,
        String id,
        @Nullable String kind,
        String name,
        String provider,
        @Nullable String roles,
        String type,
        String userId) {
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.kind = kind;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.provider = Objects.requireNonNull(provider, "expected parameter 'provider' to be non-null");
        this.roles = roles;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userId = Objects.requireNonNull(userId, "expected parameter 'userId' to be non-null");
    }

    private StaticSiteUserARMResourceResponse() {
        this.displayName = null;
        this.id = null;
        this.kind = null;
        this.name = null;
        this.provider = null;
        this.roles = null;
        this.type = null;
        this.userId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StaticSiteUserARMResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String id;
        private @Nullable String kind;
        private String name;
        private String provider;
        private @Nullable String roles;
        private String type;
        private String userId;

        public Builder() {
    	      // Empty
        }

        public Builder(StaticSiteUserARMResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.provider = defaults.provider;
    	      this.roles = defaults.roles;
    	      this.type = defaults.type;
    	      this.userId = defaults.userId;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvider(String provider) {
            this.provider = Objects.requireNonNull(provider);
            return this;
        }

        public Builder setRoles(@Nullable String roles) {
            this.roles = roles;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }

        public StaticSiteUserARMResourceResponse build() {
            return new StaticSiteUserARMResourceResponse(displayName, id, kind, name, provider, roles, type, userId);
        }
    }
}
