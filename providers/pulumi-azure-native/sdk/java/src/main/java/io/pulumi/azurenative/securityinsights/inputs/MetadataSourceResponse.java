// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The original source of the content item, where it comes from.
 * 
 */
public final class MetadataSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final MetadataSourceResponse Empty = new MetadataSourceResponse();

    /**
     * Source type of the content
     * 
     */
    @Import(name="kind", required=true)
      private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * Name of the content source.  The repo name, solution name, LA workspace name etc.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * ID of the content source.  The solution ID, workspace ID, etc
     * 
     */
    @Import(name="sourceId")
      private final @Nullable String sourceId;

    public Optional<String> getSourceId() {
        return this.sourceId == null ? Optional.empty() : Optional.ofNullable(this.sourceId);
    }

    public MetadataSourceResponse(
        String kind,
        @Nullable String name,
        @Nullable String sourceId) {
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.name = name;
        this.sourceId = sourceId;
    }

    private MetadataSourceResponse() {
        this.kind = null;
        this.name = null;
        this.sourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private @Nullable String name;
        private @Nullable String sourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.sourceId = defaults.sourceId;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder sourceId(@Nullable String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public MetadataSourceResponse build() {
            return new MetadataSourceResponse(kind, name, sourceId);
        }
    }
}
