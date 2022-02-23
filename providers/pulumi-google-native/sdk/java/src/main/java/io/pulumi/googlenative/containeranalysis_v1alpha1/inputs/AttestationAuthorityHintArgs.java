// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This submessage provides human-readable hints about the purpose of the AttestationAuthority. Because the name of a Note acts as its resource reference, it is important to disambiguate the canonical name of the Note (which might be a UUID for security purposes) from "readable" names more suitable for debug output. Note that these hints should NOT be used to look up AttestationAuthorities in security sensitive contexts, such as when looking up Attestations to verify.
 * 
 */
public final class AttestationAuthorityHintArgs extends io.pulumi.resources.ResourceArgs {

    public static final AttestationAuthorityHintArgs Empty = new AttestationAuthorityHintArgs();

    /**
     * The human readable name of this Attestation Authority, for example "qa".
     * 
     */
    @InputImport(name="humanReadableName")
      private final @Nullable Input<String> humanReadableName;

    public Input<String> getHumanReadableName() {
        return this.humanReadableName == null ? Input.empty() : this.humanReadableName;
    }

    public AttestationAuthorityHintArgs(@Nullable Input<String> humanReadableName) {
        this.humanReadableName = humanReadableName;
    }

    private AttestationAuthorityHintArgs() {
        this.humanReadableName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttestationAuthorityHintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> humanReadableName;

        public Builder() {
    	      // Empty
        }

        public Builder(AttestationAuthorityHintArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.humanReadableName = defaults.humanReadableName;
        }

        public Builder setHumanReadableName(@Nullable Input<String> humanReadableName) {
            this.humanReadableName = humanReadableName;
            return this;
        }

        public Builder setHumanReadableName(@Nullable String humanReadableName) {
            this.humanReadableName = Input.ofNullable(humanReadableName);
            return this;
        }
        public AttestationAuthorityHintArgs build() {
            return new AttestationAuthorityHintArgs(humanReadableName);
        }
    }
}
