// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.inputs;

import io.pulumi.aws.elasticsearch.inputs.DomainSamlOptionsSamlOptionsGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainSamlOptionsState extends io.pulumi.resources.ResourceArgs {

    public static final DomainSamlOptionsState Empty = new DomainSamlOptionsState();

    /**
     * Name of the domain.
     * 
     */
    @Import(name="domainName")
      private final @Nullable Output<String> domainName;

    public Output<String> getDomainName() {
        return this.domainName == null ? Output.empty() : this.domainName;
    }

    /**
     * The SAML authentication options for an AWS Elasticsearch Domain.
     * 
     */
    @Import(name="samlOptions")
      private final @Nullable Output<DomainSamlOptionsSamlOptionsGetArgs> samlOptions;

    public Output<DomainSamlOptionsSamlOptionsGetArgs> getSamlOptions() {
        return this.samlOptions == null ? Output.empty() : this.samlOptions;
    }

    public DomainSamlOptionsState(
        @Nullable Output<String> domainName,
        @Nullable Output<DomainSamlOptionsSamlOptionsGetArgs> samlOptions) {
        this.domainName = domainName;
        this.samlOptions = samlOptions;
    }

    private DomainSamlOptionsState() {
        this.domainName = Output.empty();
        this.samlOptions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainSamlOptionsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> domainName;
        private @Nullable Output<DomainSamlOptionsSamlOptionsGetArgs> samlOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainSamlOptionsState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.samlOptions = defaults.samlOptions;
        }

        public Builder domainName(@Nullable Output<String> domainName) {
            this.domainName = domainName;
            return this;
        }

        public Builder domainName(@Nullable String domainName) {
            this.domainName = Output.ofNullable(domainName);
            return this;
        }

        public Builder samlOptions(@Nullable Output<DomainSamlOptionsSamlOptionsGetArgs> samlOptions) {
            this.samlOptions = samlOptions;
            return this;
        }

        public Builder samlOptions(@Nullable DomainSamlOptionsSamlOptionsGetArgs samlOptions) {
            this.samlOptions = Output.ofNullable(samlOptions);
            return this;
        }
        public DomainSamlOptionsState build() {
            return new DomainSamlOptionsState(domainName, samlOptions);
        }
    }
}
