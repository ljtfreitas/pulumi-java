// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An API Version Set contains the common configuration for a set of API Versions relating
 * 
 */
public final class ApiVersionSetContractDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiVersionSetContractDetailsArgs Empty = new ApiVersionSetContractDetailsArgs();

    /**
     * Description of API Version Set.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Identifier for existing API Version Set. Omit this value to create a new Version Set.
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * The display Name of the API Version Set.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Name of HTTP header parameter that indicates the API Version if versioningScheme is set to `header`.
     * 
     */
    @InputImport(name="versionHeaderName")
    private final @Nullable Input<String> versionHeaderName;

    public Input<String> getVersionHeaderName() {
        return this.versionHeaderName == null ? Input.empty() : this.versionHeaderName;
    }

    /**
     * Name of query parameter that indicates the API Version if versioningScheme is set to `query`.
     * 
     */
    @InputImport(name="versionQueryName")
    private final @Nullable Input<String> versionQueryName;

    public Input<String> getVersionQueryName() {
        return this.versionQueryName == null ? Input.empty() : this.versionQueryName;
    }

    /**
     * An value that determines where the API Version identifier will be located in a HTTP request.
     * 
     */
    @InputImport(name="versioningScheme")
    private final @Nullable Input<String> versioningScheme;

    public Input<String> getVersioningScheme() {
        return this.versioningScheme == null ? Input.empty() : this.versioningScheme;
    }

    public ApiVersionSetContractDetailsArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> id,
        @Nullable Input<String> name,
        @Nullable Input<String> versionHeaderName,
        @Nullable Input<String> versionQueryName,
        @Nullable Input<String> versioningScheme) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.versionHeaderName = versionHeaderName;
        this.versionQueryName = versionQueryName;
        this.versioningScheme = versioningScheme;
    }

    private ApiVersionSetContractDetailsArgs() {
        this.description = Input.empty();
        this.id = Input.empty();
        this.name = Input.empty();
        this.versionHeaderName = Input.empty();
        this.versionQueryName = Input.empty();
        this.versioningScheme = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiVersionSetContractDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> id;
        private @Nullable Input<String> name;
        private @Nullable Input<String> versionHeaderName;
        private @Nullable Input<String> versionQueryName;
        private @Nullable Input<String> versioningScheme;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiVersionSetContractDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.versionHeaderName = defaults.versionHeaderName;
    	      this.versionQueryName = defaults.versionQueryName;
    	      this.versioningScheme = defaults.versioningScheme;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setVersionHeaderName(@Nullable Input<String> versionHeaderName) {
            this.versionHeaderName = versionHeaderName;
            return this;
        }

        public Builder setVersionHeaderName(@Nullable String versionHeaderName) {
            this.versionHeaderName = Input.ofNullable(versionHeaderName);
            return this;
        }

        public Builder setVersionQueryName(@Nullable Input<String> versionQueryName) {
            this.versionQueryName = versionQueryName;
            return this;
        }

        public Builder setVersionQueryName(@Nullable String versionQueryName) {
            this.versionQueryName = Input.ofNullable(versionQueryName);
            return this;
        }

        public Builder setVersioningScheme(@Nullable Input<String> versioningScheme) {
            this.versioningScheme = versioningScheme;
            return this;
        }

        public Builder setVersioningScheme(@Nullable String versioningScheme) {
            this.versioningScheme = Input.ofNullable(versioningScheme);
            return this;
        }

        public ApiVersionSetContractDetailsArgs build() {
            return new ApiVersionSetContractDetailsArgs(description, id, name, versionHeaderName, versionQueryName, versioningScheme);
        }
    }
}
