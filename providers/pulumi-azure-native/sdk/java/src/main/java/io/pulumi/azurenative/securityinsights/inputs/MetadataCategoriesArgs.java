// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ies for the solution content item
 * 
 */
public final class MetadataCategoriesArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetadataCategoriesArgs Empty = new MetadataCategoriesArgs();

    /**
     * domain for the solution content item
     * 
     */
    @InputImport(name="domains")
        private final @Nullable Input<List<String>> domains;

    public Input<List<String>> getDomains() {
        return this.domains == null ? Input.empty() : this.domains;
    }

    /**
     * Industry verticals for the solution content item
     * 
     */
    @InputImport(name="verticals")
        private final @Nullable Input<List<String>> verticals;

    public Input<List<String>> getVerticals() {
        return this.verticals == null ? Input.empty() : this.verticals;
    }

    public MetadataCategoriesArgs(
        @Nullable Input<List<String>> domains,
        @Nullable Input<List<String>> verticals) {
        this.domains = domains;
        this.verticals = verticals;
    }

    private MetadataCategoriesArgs() {
        this.domains = Input.empty();
        this.verticals = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataCategoriesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> domains;
        private @Nullable Input<List<String>> verticals;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataCategoriesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domains = defaults.domains;
    	      this.verticals = defaults.verticals;
        }

        public Builder setDomains(@Nullable Input<List<String>> domains) {
            this.domains = domains;
            return this;
        }

        public Builder setDomains(@Nullable List<String> domains) {
            this.domains = Input.ofNullable(domains);
            return this;
        }

        public Builder setVerticals(@Nullable Input<List<String>> verticals) {
            this.verticals = verticals;
            return this;
        }

        public Builder setVerticals(@Nullable List<String> verticals) {
            this.verticals = Input.ofNullable(verticals);
            return this;
        }
        public MetadataCategoriesArgs build() {
            return new MetadataCategoriesArgs(domains, verticals);
        }
    }
}
