// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Data privacy setting of the Bot.
 * 
 */
public final class DataPrivacyProperties extends io.pulumi.resources.InvokeArgs {

    public static final DataPrivacyProperties Empty = new DataPrivacyProperties();

    @Import(name="childDirected", required=true)
      private final Boolean childDirected;

    public Boolean getChildDirected() {
        return this.childDirected;
    }

    public DataPrivacyProperties(Boolean childDirected) {
        this.childDirected = Objects.requireNonNull(childDirected, "expected parameter 'childDirected' to be non-null");
    }

    private DataPrivacyProperties() {
        this.childDirected = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataPrivacyProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean childDirected;

        public Builder() {
    	      // Empty
        }

        public Builder(DataPrivacyProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.childDirected = defaults.childDirected;
        }

        public Builder childDirected(Boolean childDirected) {
            this.childDirected = Objects.requireNonNull(childDirected);
            return this;
        }
        public DataPrivacyProperties build() {
            return new DataPrivacyProperties(childDirected);
        }
    }
}
