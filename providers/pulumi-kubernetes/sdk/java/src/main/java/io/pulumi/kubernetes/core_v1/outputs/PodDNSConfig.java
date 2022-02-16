// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.PodDNSConfigOption;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class PodDNSConfig {
    private final @Nullable List<String> nameservers;
    private final @Nullable List<PodDNSConfigOption> options;
    private final @Nullable List<String> searches;

    @OutputCustomType.Constructor({"nameservers","options","searches"})
    private PodDNSConfig(
        @Nullable List<String> nameservers,
        @Nullable List<PodDNSConfigOption> options,
        @Nullable List<String> searches) {
        this.nameservers = nameservers;
        this.options = options;
        this.searches = searches;
    }

    public List<String> getNameservers() {
        return this.nameservers == null ? List.of() : this.nameservers;
    }
    public List<PodDNSConfigOption> getOptions() {
        return this.options == null ? List.of() : this.options;
    }
    public List<String> getSearches() {
        return this.searches == null ? List.of() : this.searches;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodDNSConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> nameservers;
        private @Nullable List<PodDNSConfigOption> options;
        private @Nullable List<String> searches;

        public Builder() {
    	      // Empty
        }

        public Builder(PodDNSConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nameservers = defaults.nameservers;
    	      this.options = defaults.options;
    	      this.searches = defaults.searches;
        }

        public Builder setNameservers(@Nullable List<String> nameservers) {
            this.nameservers = nameservers;
            return this;
        }

        public Builder setOptions(@Nullable List<PodDNSConfigOption> options) {
            this.options = options;
            return this;
        }

        public Builder setSearches(@Nullable List<String> searches) {
            this.searches = searches;
            return this;
        }

        public PodDNSConfig build() {
            return new PodDNSConfig(nameservers, options, searches);
        }
    }
}