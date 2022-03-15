// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * DocumentNote represents an SPDX Document Creation Infromation section: https://spdx.github.io/spdx-spec/2-document-creation-information/
 * 
 */
public final class DocumentNoteArgs extends io.pulumi.resources.ResourceArgs {

    public static final DocumentNoteArgs Empty = new DocumentNoteArgs();

    /**
     * Compliance with the SPDX specification includes populating the SPDX fields therein with data related to such fields ("SPDX-Metadata")
     * 
     */
    @Import(name="dataLicence")
      private final @Nullable Output<String> dataLicence;

    public Output<String> getDataLicence() {
        return this.dataLicence == null ? Output.empty() : this.dataLicence;
    }

    /**
     * Provide a reference number that can be used to understand how to parse and interpret the rest of the file
     * 
     */
    @Import(name="spdxVersion")
      private final @Nullable Output<String> spdxVersion;

    public Output<String> getSpdxVersion() {
        return this.spdxVersion == null ? Output.empty() : this.spdxVersion;
    }

    public DocumentNoteArgs(
        @Nullable Output<String> dataLicence,
        @Nullable Output<String> spdxVersion) {
        this.dataLicence = dataLicence;
        this.spdxVersion = spdxVersion;
    }

    private DocumentNoteArgs() {
        this.dataLicence = Output.empty();
        this.spdxVersion = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentNoteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> dataLicence;
        private @Nullable Output<String> spdxVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentNoteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataLicence = defaults.dataLicence;
    	      this.spdxVersion = defaults.spdxVersion;
        }

        public Builder dataLicence(@Nullable Output<String> dataLicence) {
            this.dataLicence = dataLicence;
            return this;
        }

        public Builder dataLicence(@Nullable String dataLicence) {
            this.dataLicence = Output.ofNullable(dataLicence);
            return this;
        }

        public Builder spdxVersion(@Nullable Output<String> spdxVersion) {
            this.spdxVersion = spdxVersion;
            return this;
        }

        public Builder spdxVersion(@Nullable String spdxVersion) {
            this.spdxVersion = Output.ofNullable(spdxVersion);
            return this;
        }
        public DocumentNoteArgs build() {
            return new DocumentNoteArgs(dataLicence, spdxVersion);
        }
    }
}
