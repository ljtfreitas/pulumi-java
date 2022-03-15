// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentMessageTextArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxPageEntryFulfillmentMessageArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxPageEntryFulfillmentMessageArgs Empty = new CxPageEntryFulfillmentMessageArgs();

    /**
     * A collection of text responses.
     * 
     */
    @Import(name="text")
      private final @Nullable Output<CxPageEntryFulfillmentMessageTextArgs> text;

    public Output<CxPageEntryFulfillmentMessageTextArgs> getText() {
        return this.text == null ? Output.empty() : this.text;
    }

    public CxPageEntryFulfillmentMessageArgs(@Nullable Output<CxPageEntryFulfillmentMessageTextArgs> text) {
        this.text = text;
    }

    private CxPageEntryFulfillmentMessageArgs() {
        this.text = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageEntryFulfillmentMessageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CxPageEntryFulfillmentMessageTextArgs> text;

        public Builder() {
    	      // Empty
        }

        public Builder(CxPageEntryFulfillmentMessageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
        }

        public Builder text(@Nullable Output<CxPageEntryFulfillmentMessageTextArgs> text) {
            this.text = text;
            return this;
        }

        public Builder text(@Nullable CxPageEntryFulfillmentMessageTextArgs text) {
            this.text = Output.ofNullable(text);
            return this;
        }
        public CxPageEntryFulfillmentMessageArgs build() {
            return new CxPageEntryFulfillmentMessageArgs(text);
        }
    }
}
