// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The public domain name to use with the container service, such as example.com and www.example.com.
 * 
 */
public final class ContainerPublicDomainNameArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerPublicDomainNameArgs Empty = new ContainerPublicDomainNameArgs();

    @Import(name="certificateName")
      private final @Nullable Output<String> certificateName;

    public Output<String> getCertificateName() {
        return this.certificateName == null ? Output.empty() : this.certificateName;
    }

    /**
     * An object that describes the configuration for the containers of the deployment.
     * 
     */
    @Import(name="domainNames")
      private final @Nullable Output<List<String>> domainNames;

    public Output<List<String>> getDomainNames() {
        return this.domainNames == null ? Output.empty() : this.domainNames;
    }

    public ContainerPublicDomainNameArgs(
        @Nullable Output<String> certificateName,
        @Nullable Output<List<String>> domainNames) {
        this.certificateName = certificateName;
        this.domainNames = domainNames;
    }

    private ContainerPublicDomainNameArgs() {
        this.certificateName = Output.empty();
        this.domainNames = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerPublicDomainNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> certificateName;
        private @Nullable Output<List<String>> domainNames;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerPublicDomainNameArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateName = defaults.certificateName;
    	      this.domainNames = defaults.domainNames;
        }

        public Builder certificateName(@Nullable Output<String> certificateName) {
            this.certificateName = certificateName;
            return this;
        }

        public Builder certificateName(@Nullable String certificateName) {
            this.certificateName = Output.ofNullable(certificateName);
            return this;
        }

        public Builder domainNames(@Nullable Output<List<String>> domainNames) {
            this.domainNames = domainNames;
            return this;
        }

        public Builder domainNames(@Nullable List<String> domainNames) {
            this.domainNames = Output.ofNullable(domainNames);
            return this;
        }
        public ContainerPublicDomainNameArgs build() {
            return new ContainerPublicDomainNameArgs(certificateName, domainNames);
        }
    }
}
