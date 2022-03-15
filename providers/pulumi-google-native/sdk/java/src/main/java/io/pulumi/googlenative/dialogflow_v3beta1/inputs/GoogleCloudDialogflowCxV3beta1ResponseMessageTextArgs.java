// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The text response message.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1ResponseMessageTextArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1ResponseMessageTextArgs Empty = new GoogleCloudDialogflowCxV3beta1ResponseMessageTextArgs();

    /**
     * A collection of text responses.
     * 
     */
    @Import(name="text", required=true)
      private final Output<List<String>> text;

    public Output<List<String>> getText() {
        return this.text;
    }

    public GoogleCloudDialogflowCxV3beta1ResponseMessageTextArgs(Output<List<String>> text) {
        this.text = Objects.requireNonNull(text, "expected parameter 'text' to be non-null");
    }

    private GoogleCloudDialogflowCxV3beta1ResponseMessageTextArgs() {
        this.text = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1ResponseMessageTextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1ResponseMessageTextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
        }

        public Builder text(Output<List<String>> text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }

        public Builder text(List<String> text) {
            this.text = Output.of(Objects.requireNonNull(text));
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1ResponseMessageTextArgs build() {
            return new GoogleCloudDialogflowCxV3beta1ResponseMessageTextArgs(text);
        }
    }
}
