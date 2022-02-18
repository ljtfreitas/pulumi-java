// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ies for the solution content item
 * 
 */
public final class MetadataCategoriesResponse extends io.pulumi.resources.InvokeArgs {

    public static final MetadataCategoriesResponse Empty = new MetadataCategoriesResponse();

    /**
     * domain for the solution content item
     * 
     */
    @InputImport(name="domains")
    private final @Nullable List<String> domains;

    public List<String> getDomains() {
        return this.domains == null ? List.of() : this.domains;
    }

    /**
     * Industry verticals for the solution content item
     * 
     */
    @InputImport(name="verticals")
    private final @Nullable List<String> verticals;

    public List<String> getVerticals() {
        return this.verticals == null ? List.of() : this.verticals;
    }

    public MetadataCategoriesResponse(
        @Nullable List<String> domains,
        @Nullable List<String> verticals) {
        this.domains = domains;
        this.verticals = verticals;
    }

    private MetadataCategoriesResponse() {
        this.domains = List.of();
        this.verticals = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataCategoriesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> domains;
        private @Nullable List<String> verticals;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataCategoriesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domains = defaults.domains;
    	      this.verticals = defaults.verticals;
        }

        public Builder setDomains(@Nullable List<String> domains) {
            this.domains = domains;
            return this;
        }

        public Builder setVerticals(@Nullable List<String> verticals) {
            this.verticals = verticals;
            return this;
        }

        public MetadataCategoriesResponse build() {
            return new MetadataCategoriesResponse(domains, verticals);
        }
    }
}
