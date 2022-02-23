// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.translate_v3beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.translate_v3beta1.inputs.GcsSourceArgs;
import java.util.Objects;


/**
 * Input configuration for glossaries.
 * 
 */
public final class GlossaryInputConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GlossaryInputConfigArgs Empty = new GlossaryInputConfigArgs();

    /**
     * Google Cloud Storage location of glossary data. File format is determined based on the filename extension. API returns [google.rpc.Code.INVALID_ARGUMENT] for unsupported URI-s and file formats. Wildcards are not allowed. This must be a single file in one of the following formats: For unidirectional glossaries: - TSV/CSV (`.tsv`/`.csv`): 2 column file, tab- or comma-separated. The first column is source text. The second column is target text. The file must not contain headers. That is, the first row is data, not column names. - TMX (`.tmx`): TMX file with parallel data defining source/target term pairs. For equivalent term sets glossaries: - CSV (`.csv`): Multi-column CSV file defining equivalent glossary terms in multiple languages. The format is defined for Google Translation Toolkit and documented in [Use a glossary](https://support.google.com/translatortoolkit/answer/6306379?hl=en).
     * 
     */
    @InputImport(name="gcsSource", required=true)
      private final Input<GcsSourceArgs> gcsSource;

    public Input<GcsSourceArgs> getGcsSource() {
        return this.gcsSource;
    }

    public GlossaryInputConfigArgs(Input<GcsSourceArgs> gcsSource) {
        this.gcsSource = Objects.requireNonNull(gcsSource, "expected parameter 'gcsSource' to be non-null");
    }

    private GlossaryInputConfigArgs() {
        this.gcsSource = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlossaryInputConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<GcsSourceArgs> gcsSource;

        public Builder() {
    	      // Empty
        }

        public Builder(GlossaryInputConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gcsSource = defaults.gcsSource;
        }

        public Builder setGcsSource(Input<GcsSourceArgs> gcsSource) {
            this.gcsSource = Objects.requireNonNull(gcsSource);
            return this;
        }

        public Builder setGcsSource(GcsSourceArgs gcsSource) {
            this.gcsSource = Input.of(Objects.requireNonNull(gcsSource));
            return this;
        }
        public GlossaryInputConfigArgs build() {
            return new GlossaryInputConfigArgs(gcsSource);
        }
    }
}
