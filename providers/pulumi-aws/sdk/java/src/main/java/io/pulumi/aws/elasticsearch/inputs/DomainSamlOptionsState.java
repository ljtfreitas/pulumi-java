// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.inputs;

import io.pulumi.aws.elasticsearch.inputs.DomainSamlOptionsSamlOptionsGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainSamlOptionsState extends io.pulumi.resources.ResourceArgs {

    public static final DomainSamlOptionsState Empty = new DomainSamlOptionsState();

    /**
     * Name of the domain.
     * 
     */
    @InputImport(name="domainName")
    private final @Nullable Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName == null ? Input.empty() : this.domainName;
    }

    /**
     * The SAML authentication options for an AWS Elasticsearch Domain.
     * 
     */
    @InputImport(name="samlOptions")
    private final @Nullable Input<DomainSamlOptionsSamlOptionsGetArgs> samlOptions;

    public Input<DomainSamlOptionsSamlOptionsGetArgs> getSamlOptions() {
        return this.samlOptions == null ? Input.empty() : this.samlOptions;
    }

    public DomainSamlOptionsState(
        @Nullable Input<String> domainName,
        @Nullable Input<DomainSamlOptionsSamlOptionsGetArgs> samlOptions) {
        this.domainName = domainName;
        this.samlOptions = samlOptions;
    }

    private DomainSamlOptionsState() {
        this.domainName = Input.empty();
        this.samlOptions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainSamlOptionsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> domainName;
        private @Nullable Input<DomainSamlOptionsSamlOptionsGetArgs> samlOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainSamlOptionsState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.samlOptions = defaults.samlOptions;
        }

        public Builder setDomainName(@Nullable Input<String> domainName) {
            this.domainName = domainName;
            return this;
        }

        public Builder setDomainName(@Nullable String domainName) {
            this.domainName = Input.ofNullable(domainName);
            return this;
        }

        public Builder setSamlOptions(@Nullable Input<DomainSamlOptionsSamlOptionsGetArgs> samlOptions) {
            this.samlOptions = samlOptions;
            return this;
        }

        public Builder setSamlOptions(@Nullable DomainSamlOptionsSamlOptionsGetArgs samlOptions) {
            this.samlOptions = Input.ofNullable(samlOptions);
            return this;
        }
        public DomainSamlOptionsState build() {
            return new DomainSamlOptionsState(domainName, samlOptions);
        }
    }
}
