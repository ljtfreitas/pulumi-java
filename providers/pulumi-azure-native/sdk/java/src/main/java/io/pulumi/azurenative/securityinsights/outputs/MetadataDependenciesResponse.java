// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MetadataDependenciesResponse {
    /**
     * Id of the content item we depend on
     * 
     */
    private final @Nullable String contentId;
    /**
     * This is the list of dependencies we must fulfill, according to the AND/OR operator
     * 
     */
    private final @Nullable List<MetadataDependenciesResponse> criteria;
    /**
     * Type of the content item we depend on
     * 
     */
    private final @Nullable String kind;
    /**
     * Name of the content item
     * 
     */
    private final @Nullable String name;
    /**
     * Operator used for list of dependencies in criteria array.
     * 
     */
    private final @Nullable String operator;
    /**
     * Version of the the content item we depend on.  Can be blank, * or missing to indicate any version fulfills the dependency.  If version does not match our defined numeric format then an exact match is required.
     * 
     */
    private final @Nullable String version;

    @CustomType.Constructor
    private MetadataDependenciesResponse(
        @CustomType.Parameter("contentId") @Nullable String contentId,
        @CustomType.Parameter("criteria") @Nullable List<MetadataDependenciesResponse> criteria,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("operator") @Nullable String operator,
        @CustomType.Parameter("version") @Nullable String version) {
        this.contentId = contentId;
        this.criteria = criteria;
        this.kind = kind;
        this.name = name;
        this.operator = operator;
        this.version = version;
    }

    /**
     * Id of the content item we depend on
     * 
    */
    public Optional<String> getContentId() {
        return Optional.ofNullable(this.contentId);
    }
    /**
     * This is the list of dependencies we must fulfill, according to the AND/OR operator
     * 
    */
    public List<MetadataDependenciesResponse> getCriteria() {
        return this.criteria == null ? List.of() : this.criteria;
    }
    /**
     * Type of the content item we depend on
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Name of the content item
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Operator used for list of dependencies in criteria array.
     * 
    */
    public Optional<String> getOperator() {
        return Optional.ofNullable(this.operator);
    }
    /**
     * Version of the the content item we depend on.  Can be blank, * or missing to indicate any version fulfills the dependency.  If version does not match our defined numeric format then an exact match is required.
     * 
    */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataDependenciesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String contentId;
        private @Nullable List<MetadataDependenciesResponse> criteria;
        private @Nullable String kind;
        private @Nullable String name;
        private @Nullable String operator;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataDependenciesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentId = defaults.contentId;
    	      this.criteria = defaults.criteria;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.operator = defaults.operator;
    	      this.version = defaults.version;
        }

        public Builder contentId(@Nullable String contentId) {
            this.contentId = contentId;
            return this;
        }

        public Builder criteria(@Nullable List<MetadataDependenciesResponse> criteria) {
            this.criteria = criteria;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder operator(@Nullable String operator) {
            this.operator = operator;
            return this;
        }

        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }
        public MetadataDependenciesResponse build() {
            return new MetadataDependenciesResponse(contentId, criteria, kind, name, operator, version);
        }
    }
}
