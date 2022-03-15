// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPrefixListArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPrefixListArgs Empty = new GetPrefixListArgs();

    /**
     * Id of Prefix List.
     * 
     */
    @Import(name="prefixListId", required=true)
      private final String prefixListId;

    public String getPrefixListId() {
        return this.prefixListId;
    }

    public GetPrefixListArgs(String prefixListId) {
        this.prefixListId = Objects.requireNonNull(prefixListId, "expected parameter 'prefixListId' to be non-null");
    }

    private GetPrefixListArgs() {
        this.prefixListId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrefixListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String prefixListId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrefixListArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prefixListId = defaults.prefixListId;
        }

        public Builder prefixListId(String prefixListId) {
            this.prefixListId = Objects.requireNonNull(prefixListId);
            return this;
        }
        public GetPrefixListArgs build() {
            return new GetPrefixListArgs(prefixListId);
        }
    }
}
