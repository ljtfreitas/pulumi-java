// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.changeanalysis.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SystemDataResponse {
    /**
     * The timestamp of resource creation (UTC)
     * 
     */
    private final String createdAt;
    /**
     * A string identifier for the identity that created the resource
     * 
     */
    private final String createdBy;
    /**
     * The type of identity that created the resource: user, application, managedIdentity, key
     * 
     */
    private final String createdByType;
    /**
     * The timestamp of resource last modification (UTC)
     * 
     */
    private final String lastModifiedAt;
    /**
     * A string identifier for the identity that last modified the resource
     * 
     */
    private final String lastModifiedBy;
    /**
     * The type of identity that last modified the resource: user, application, managedIdentity, key
     * 
     */
    private final String lastModifiedByType;

    @OutputCustomType.Constructor({"createdAt","createdBy","createdByType","lastModifiedAt","lastModifiedBy","lastModifiedByType"})
    private SystemDataResponse(
        String createdAt,
        String createdBy,
        String createdByType,
        String lastModifiedAt,
        String lastModifiedBy,
        String lastModifiedByType) {
        this.createdAt = Objects.requireNonNull(createdAt);
        this.createdBy = Objects.requireNonNull(createdBy);
        this.createdByType = Objects.requireNonNull(createdByType);
        this.lastModifiedAt = Objects.requireNonNull(lastModifiedAt);
        this.lastModifiedBy = Objects.requireNonNull(lastModifiedBy);
        this.lastModifiedByType = Objects.requireNonNull(lastModifiedByType);
    }

    /**
     * The timestamp of resource creation (UTC)
     * 
     */
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * A string identifier for the identity that created the resource
     * 
     */
    public String getCreatedBy() {
        return this.createdBy;
    }
    /**
     * The type of identity that created the resource: user, application, managedIdentity, key
     * 
     */
    public String getCreatedByType() {
        return this.createdByType;
    }
    /**
     * The timestamp of resource last modification (UTC)
     * 
     */
    public String getLastModifiedAt() {
        return this.lastModifiedAt;
    }
    /**
     * A string identifier for the identity that last modified the resource
     * 
     */
    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * The type of identity that last modified the resource: user, application, managedIdentity, key
     * 
     */
    public String getLastModifiedByType() {
        return this.lastModifiedByType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SystemDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdAt;
        private String createdBy;
        private String createdByType;
        private String lastModifiedAt;
        private String lastModifiedBy;
        private String lastModifiedByType;

        public Builder() {
    	      // Empty
        }

        public Builder(SystemDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.createdBy = defaults.createdBy;
    	      this.createdByType = defaults.createdByType;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.lastModifiedBy = defaults.lastModifiedBy;
    	      this.lastModifiedByType = defaults.lastModifiedByType;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }

        public Builder setCreatedBy(String createdBy) {
            this.createdBy = Objects.requireNonNull(createdBy);
            return this;
        }

        public Builder setCreatedByType(String createdByType) {
            this.createdByType = Objects.requireNonNull(createdByType);
            return this;
        }

        public Builder setLastModifiedAt(String lastModifiedAt) {
            this.lastModifiedAt = Objects.requireNonNull(lastModifiedAt);
            return this;
        }

        public Builder setLastModifiedBy(String lastModifiedBy) {
            this.lastModifiedBy = Objects.requireNonNull(lastModifiedBy);
            return this;
        }

        public Builder setLastModifiedByType(String lastModifiedByType) {
            this.lastModifiedByType = Objects.requireNonNull(lastModifiedByType);
            return this;
        }
        public SystemDataResponse build() {
            return new SystemDataResponse(createdAt, createdBy, createdByType, lastModifiedAt, lastModifiedBy, lastModifiedByType);
        }
    }
}
