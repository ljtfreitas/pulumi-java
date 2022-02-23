// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxEntityTypeExcludedPhraseGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxEntityTypeExcludedPhraseGetArgs Empty = new CxEntityTypeExcludedPhraseGetArgs();

    /**
     * The word or phrase to be excluded.
     * 
     */
    @InputImport(name="value")
        private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public CxEntityTypeExcludedPhraseGetArgs(@Nullable Input<String> value) {
        this.value = value;
    }

    private CxEntityTypeExcludedPhraseGetArgs() {
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxEntityTypeExcludedPhraseGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(CxEntityTypeExcludedPhraseGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public CxEntityTypeExcludedPhraseGetArgs build() {
            return new CxEntityTypeExcludedPhraseGetArgs(value);
        }
    }
}
