// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * DNS configuration for the container group.
 * 
 */
public final class DnsConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final DnsConfigurationResponse Empty = new DnsConfigurationResponse();

    /**
     * The DNS servers for the container group.
     * 
     */
    @Import(name="nameServers", required=true)
      private final List<String> nameServers;

    public List<String> getNameServers() {
        return this.nameServers;
    }

    /**
     * The DNS options for the container group.
     * 
     */
    @Import(name="options")
      private final @Nullable String options;

    public Optional<String> getOptions() {
        return this.options == null ? Optional.empty() : Optional.ofNullable(this.options);
    }

    /**
     * The DNS search domains for hostname lookup in the container group.
     * 
     */
    @Import(name="searchDomains")
      private final @Nullable String searchDomains;

    public Optional<String> getSearchDomains() {
        return this.searchDomains == null ? Optional.empty() : Optional.ofNullable(this.searchDomains);
    }

    public DnsConfigurationResponse(
        List<String> nameServers,
        @Nullable String options,
        @Nullable String searchDomains) {
        this.nameServers = Objects.requireNonNull(nameServers, "expected parameter 'nameServers' to be non-null");
        this.options = options;
        this.searchDomains = searchDomains;
    }

    private DnsConfigurationResponse() {
        this.nameServers = List.of();
        this.options = null;
        this.searchDomains = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DnsConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> nameServers;
        private @Nullable String options;
        private @Nullable String searchDomains;

        public Builder() {
    	      // Empty
        }

        public Builder(DnsConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nameServers = defaults.nameServers;
    	      this.options = defaults.options;
    	      this.searchDomains = defaults.searchDomains;
        }

        public Builder nameServers(List<String> nameServers) {
            this.nameServers = Objects.requireNonNull(nameServers);
            return this;
        }

        public Builder options(@Nullable String options) {
            this.options = options;
            return this;
        }

        public Builder searchDomains(@Nullable String searchDomains) {
            this.searchDomains = searchDomains;
            return this;
        }
        public DnsConfigurationResponse build() {
            return new DnsConfigurationResponse(nameServers, options, searchDomains);
        }
    }
}
