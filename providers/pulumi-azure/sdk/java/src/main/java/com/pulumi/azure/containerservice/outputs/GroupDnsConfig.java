// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GroupDnsConfig {
    /**
     * @return A list of nameservers the containers will search out to resolve requests.
     * 
     */
    private final List<String> nameservers;
    /**
     * @return A list of [resolver configuration options](https://man7.org/linux/man-pages/man5/resolv.conf.5.html).
     * 
     */
    private final @Nullable List<String> options;
    /**
     * @return A list of search domains that DNS requests will search along.
     * 
     */
    private final @Nullable List<String> searchDomains;

    @CustomType.Constructor
    private GroupDnsConfig(
        @CustomType.Parameter("nameservers") List<String> nameservers,
        @CustomType.Parameter("options") @Nullable List<String> options,
        @CustomType.Parameter("searchDomains") @Nullable List<String> searchDomains) {
        this.nameservers = nameservers;
        this.options = options;
        this.searchDomains = searchDomains;
    }

    /**
     * @return A list of nameservers the containers will search out to resolve requests.
     * 
     */
    public List<String> nameservers() {
        return this.nameservers;
    }
    /**
     * @return A list of [resolver configuration options](https://man7.org/linux/man-pages/man5/resolv.conf.5.html).
     * 
     */
    public List<String> options() {
        return this.options == null ? List.of() : this.options;
    }
    /**
     * @return A list of search domains that DNS requests will search along.
     * 
     */
    public List<String> searchDomains() {
        return this.searchDomains == null ? List.of() : this.searchDomains;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupDnsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> nameservers;
        private @Nullable List<String> options;
        private @Nullable List<String> searchDomains;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupDnsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nameservers = defaults.nameservers;
    	      this.options = defaults.options;
    	      this.searchDomains = defaults.searchDomains;
        }

        public Builder nameservers(List<String> nameservers) {
            this.nameservers = Objects.requireNonNull(nameservers);
            return this;
        }
        public Builder nameservers(String... nameservers) {
            return nameservers(List.of(nameservers));
        }
        public Builder options(@Nullable List<String> options) {
            this.options = options;
            return this;
        }
        public Builder options(String... options) {
            return options(List.of(options));
        }
        public Builder searchDomains(@Nullable List<String> searchDomains) {
            this.searchDomains = searchDomains;
            return this;
        }
        public Builder searchDomains(String... searchDomains) {
            return searchDomains(List.of(searchDomains));
        }        public GroupDnsConfig build() {
            return new GroupDnsConfig(nameservers, options, searchDomains);
        }
    }
}
