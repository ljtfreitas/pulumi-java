// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTaskSpecContainerSpecDnsConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTaskSpecContainerSpecDnsConfigArgs Empty = new ServiceTaskSpecContainerSpecDnsConfigArgs();

    @Import(name="nameservers", required=true)
      private final Output<List<String>> nameservers;

    public Output<List<String>> getNameservers() {
        return this.nameservers;
    }

    @Import(name="options")
      private final @Nullable Output<List<String>> options;

    public Output<List<String>> getOptions() {
        return this.options == null ? Output.empty() : this.options;
    }

    @Import(name="searches")
      private final @Nullable Output<List<String>> searches;

    public Output<List<String>> getSearches() {
        return this.searches == null ? Output.empty() : this.searches;
    }

    public ServiceTaskSpecContainerSpecDnsConfigArgs(
        Output<List<String>> nameservers,
        @Nullable Output<List<String>> options,
        @Nullable Output<List<String>> searches) {
        this.nameservers = Objects.requireNonNull(nameservers, "expected parameter 'nameservers' to be non-null");
        this.options = options;
        this.searches = searches;
    }

    private ServiceTaskSpecContainerSpecDnsConfigArgs() {
        this.nameservers = Output.empty();
        this.options = Output.empty();
        this.searches = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecContainerSpecDnsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> nameservers;
        private @Nullable Output<List<String>> options;
        private @Nullable Output<List<String>> searches;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecContainerSpecDnsConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nameservers = defaults.nameservers;
    	      this.options = defaults.options;
    	      this.searches = defaults.searches;
        }

        public Builder nameservers(Output<List<String>> nameservers) {
            this.nameservers = Objects.requireNonNull(nameservers);
            return this;
        }

        public Builder nameservers(List<String> nameservers) {
            this.nameservers = Output.of(Objects.requireNonNull(nameservers));
            return this;
        }

        public Builder options(@Nullable Output<List<String>> options) {
            this.options = options;
            return this;
        }

        public Builder options(@Nullable List<String> options) {
            this.options = Output.ofNullable(options);
            return this;
        }

        public Builder searches(@Nullable Output<List<String>> searches) {
            this.searches = searches;
            return this;
        }

        public Builder searches(@Nullable List<String> searches) {
            this.searches = Output.ofNullable(searches);
            return this;
        }
        public ServiceTaskSpecContainerSpecDnsConfigArgs build() {
            return new ServiceTaskSpecContainerSpecDnsConfigArgs(nameservers, options, searches);
        }
    }
}
