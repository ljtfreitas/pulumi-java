// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePassthroughExtensionsAdditionalExtensionGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateTemplatePassthroughExtensionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateTemplatePassthroughExtensionsGetArgs Empty = new CertificateTemplatePassthroughExtensionsGetArgs();

    /**
     * Optional. Describes custom X.509 extensions.
     * 
     */
    @Import(name="additionalExtensions")
      private final @Nullable Output<List<CertificateTemplatePassthroughExtensionsAdditionalExtensionGetArgs>> additionalExtensions;

    public Output<List<CertificateTemplatePassthroughExtensionsAdditionalExtensionGetArgs>> getAdditionalExtensions() {
        return this.additionalExtensions == null ? Output.empty() : this.additionalExtensions;
    }

    /**
     * Optional. A set of named X.509 extensions. Will be combined with additional_extensions to determine the full set of X.509 extensions.
     * 
     */
    @Import(name="knownExtensions")
      private final @Nullable Output<List<String>> knownExtensions;

    public Output<List<String>> getKnownExtensions() {
        return this.knownExtensions == null ? Output.empty() : this.knownExtensions;
    }

    public CertificateTemplatePassthroughExtensionsGetArgs(
        @Nullable Output<List<CertificateTemplatePassthroughExtensionsAdditionalExtensionGetArgs>> additionalExtensions,
        @Nullable Output<List<String>> knownExtensions) {
        this.additionalExtensions = additionalExtensions;
        this.knownExtensions = knownExtensions;
    }

    private CertificateTemplatePassthroughExtensionsGetArgs() {
        this.additionalExtensions = Output.empty();
        this.knownExtensions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateTemplatePassthroughExtensionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<CertificateTemplatePassthroughExtensionsAdditionalExtensionGetArgs>> additionalExtensions;
        private @Nullable Output<List<String>> knownExtensions;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateTemplatePassthroughExtensionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalExtensions = defaults.additionalExtensions;
    	      this.knownExtensions = defaults.knownExtensions;
        }

        public Builder additionalExtensions(@Nullable Output<List<CertificateTemplatePassthroughExtensionsAdditionalExtensionGetArgs>> additionalExtensions) {
            this.additionalExtensions = additionalExtensions;
            return this;
        }

        public Builder additionalExtensions(@Nullable List<CertificateTemplatePassthroughExtensionsAdditionalExtensionGetArgs> additionalExtensions) {
            this.additionalExtensions = Output.ofNullable(additionalExtensions);
            return this;
        }

        public Builder knownExtensions(@Nullable Output<List<String>> knownExtensions) {
            this.knownExtensions = knownExtensions;
            return this;
        }

        public Builder knownExtensions(@Nullable List<String> knownExtensions) {
            this.knownExtensions = Output.ofNullable(knownExtensions);
            return this;
        }
        public CertificateTemplatePassthroughExtensionsGetArgs build() {
            return new CertificateTemplatePassthroughExtensionsGetArgs(additionalExtensions, knownExtensions);
        }
    }
}
