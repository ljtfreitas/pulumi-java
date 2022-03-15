// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTaskSpecContainerSpecPrivilegesCredentialSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTaskSpecContainerSpecPrivilegesCredentialSpecArgs Empty = new ServiceTaskSpecContainerSpecPrivilegesCredentialSpecArgs();

    @Import(name="file")
      private final @Nullable Output<String> file;

    public Output<String> getFile() {
        return this.file == null ? Output.empty() : this.file;
    }

    @Import(name="registry")
      private final @Nullable Output<String> registry;

    public Output<String> getRegistry() {
        return this.registry == null ? Output.empty() : this.registry;
    }

    public ServiceTaskSpecContainerSpecPrivilegesCredentialSpecArgs(
        @Nullable Output<String> file,
        @Nullable Output<String> registry) {
        this.file = file;
        this.registry = registry;
    }

    private ServiceTaskSpecContainerSpecPrivilegesCredentialSpecArgs() {
        this.file = Output.empty();
        this.registry = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecContainerSpecPrivilegesCredentialSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> file;
        private @Nullable Output<String> registry;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecContainerSpecPrivilegesCredentialSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.file = defaults.file;
    	      this.registry = defaults.registry;
        }

        public Builder file(@Nullable Output<String> file) {
            this.file = file;
            return this;
        }

        public Builder file(@Nullable String file) {
            this.file = Output.ofNullable(file);
            return this;
        }

        public Builder registry(@Nullable Output<String> registry) {
            this.registry = registry;
            return this;
        }

        public Builder registry(@Nullable String registry) {
            this.registry = Output.ofNullable(registry);
            return this;
        }
        public ServiceTaskSpecContainerSpecPrivilegesCredentialSpecArgs build() {
            return new ServiceTaskSpecContainerSpecPrivilegesCredentialSpecArgs(file, registry);
        }
    }
}
