// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Deprecation status for a public resource.
 * 
 */
public final class DeprecationStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final DeprecationStatusResponse Empty = new DeprecationStatusResponse();

    /**
     * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to DELETED. This is only informational and the status will not change unless the client explicitly changes it.
     * 
     */
    @InputImport(name="deleted", required=true)
      private final String deleted;

    public String getDeleted() {
        return this.deleted;
    }

    /**
     * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to DEPRECATED. This is only informational and the status will not change unless the client explicitly changes it.
     * 
     */
    @InputImport(name="deprecated", required=true)
      private final String deprecated;

    public String getDeprecated() {
        return this.deprecated;
    }

    /**
     * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to OBSOLETE. This is only informational and the status will not change unless the client explicitly changes it.
     * 
     */
    @InputImport(name="obsolete", required=true)
      private final String obsolete;

    public String getObsolete() {
        return this.obsolete;
    }

    /**
     * The URL of the suggested replacement for a deprecated resource. The suggested replacement resource must be the same kind of resource as the deprecated resource.
     * 
     */
    @InputImport(name="replacement", required=true)
      private final String replacement;

    public String getReplacement() {
        return this.replacement;
    }

    /**
     * The deprecation state of this resource. This can be ACTIVE, DEPRECATED, OBSOLETE, or DELETED. Operations which communicate the end of life date for an image, can use ACTIVE. Operations which create a new resource using a DEPRECATED resource will return successfully, but with a warning indicating the deprecated resource and recommending its replacement. Operations which use OBSOLETE or DELETED resources will be rejected and result in an error.
     * 
     */
    @InputImport(name="state", required=true)
      private final String state;

    public String getState() {
        return this.state;
    }

    public DeprecationStatusResponse(
        String deleted,
        String deprecated,
        String obsolete,
        String replacement,
        String state) {
        this.deleted = Objects.requireNonNull(deleted, "expected parameter 'deleted' to be non-null");
        this.deprecated = Objects.requireNonNull(deprecated, "expected parameter 'deprecated' to be non-null");
        this.obsolete = Objects.requireNonNull(obsolete, "expected parameter 'obsolete' to be non-null");
        this.replacement = Objects.requireNonNull(replacement, "expected parameter 'replacement' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
    }

    private DeprecationStatusResponse() {
        this.deleted = null;
        this.deprecated = null;
        this.obsolete = null;
        this.replacement = null;
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeprecationStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deleted;
        private String deprecated;
        private String obsolete;
        private String replacement;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(DeprecationStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleted = defaults.deleted;
    	      this.deprecated = defaults.deprecated;
    	      this.obsolete = defaults.obsolete;
    	      this.replacement = defaults.replacement;
    	      this.state = defaults.state;
        }

        public Builder setDeleted(String deleted) {
            this.deleted = Objects.requireNonNull(deleted);
            return this;
        }

        public Builder setDeprecated(String deprecated) {
            this.deprecated = Objects.requireNonNull(deprecated);
            return this;
        }

        public Builder setObsolete(String obsolete) {
            this.obsolete = Objects.requireNonNull(obsolete);
            return this;
        }

        public Builder setReplacement(String replacement) {
            this.replacement = Objects.requireNonNull(replacement);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public DeprecationStatusResponse build() {
            return new DeprecationStatusResponse(deleted, deprecated, obsolete, replacement, state);
        }
    }
}
