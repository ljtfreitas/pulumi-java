// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * DNS configuration for the container group.
 * 
 */
public final class DnsConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DnsConfigurationArgs Empty = new DnsConfigurationArgs();

    /**
     * The DNS servers for the container group.
     * 
     */
    @InputImport(name="nameServers", required=true)
        private final Input<List<String>> nameServers;

    public Input<List<String>> getNameServers() {
        return this.nameServers;
    }

    /**
     * The DNS options for the container group.
     * 
     */
    @InputImport(name="options")
        private final @Nullable Input<String> options;

    public Input<String> getOptions() {
        return this.options == null ? Input.empty() : this.options;
    }

    /**
     * The DNS search domains for hostname lookup in the container group.
     * 
     */
    @InputImport(name="searchDomains")
        private final @Nullable Input<String> searchDomains;

    public Input<String> getSearchDomains() {
        return this.searchDomains == null ? Input.empty() : this.searchDomains;
    }

    public DnsConfigurationArgs(
        Input<List<String>> nameServers,
        @Nullable Input<String> options,
        @Nullable Input<String> searchDomains) {
        this.nameServers = Objects.requireNonNull(nameServers, "expected parameter 'nameServers' to be non-null");
        this.options = options;
        this.searchDomains = searchDomains;
    }

    private DnsConfigurationArgs() {
        this.nameServers = Input.empty();
        this.options = Input.empty();
        this.searchDomains = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DnsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> nameServers;
        private @Nullable Input<String> options;
        private @Nullable Input<String> searchDomains;

        public Builder() {
    	      // Empty
        }

        public Builder(DnsConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nameServers = defaults.nameServers;
    	      this.options = defaults.options;
    	      this.searchDomains = defaults.searchDomains;
        }

        public Builder setNameServers(Input<List<String>> nameServers) {
            this.nameServers = Objects.requireNonNull(nameServers);
            return this;
        }

        public Builder setNameServers(List<String> nameServers) {
            this.nameServers = Input.of(Objects.requireNonNull(nameServers));
            return this;
        }

        public Builder setOptions(@Nullable Input<String> options) {
            this.options = options;
            return this;
        }

        public Builder setOptions(@Nullable String options) {
            this.options = Input.ofNullable(options);
            return this;
        }

        public Builder setSearchDomains(@Nullable Input<String> searchDomains) {
            this.searchDomains = searchDomains;
            return this;
        }

        public Builder setSearchDomains(@Nullable String searchDomains) {
            this.searchDomains = Input.ofNullable(searchDomains);
            return this;
        }
        public DnsConfigurationArgs build() {
            return new DnsConfigurationArgs(nameServers, options, searchDomains);
        }
    }
}
