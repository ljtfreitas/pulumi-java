// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.azurenative.botservice.inputs.DirectLineSiteArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The parameters to provide for the Direct Line channel.
 * 
 */
public final class DirectLineChannelPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final DirectLineChannelPropertiesArgs Empty = new DirectLineChannelPropertiesArgs();

    /**
     * Direct Line embed code of the resource
     * 
     */
    @Import(name="directLineEmbedCode")
      private final @Nullable Output<String> directLineEmbedCode;

    public Output<String> getDirectLineEmbedCode() {
        return this.directLineEmbedCode == null ? Output.empty() : this.directLineEmbedCode;
    }

    /**
     * The list of Direct Line sites
     * 
     */
    @Import(name="sites")
      private final @Nullable Output<List<DirectLineSiteArgs>> sites;

    public Output<List<DirectLineSiteArgs>> getSites() {
        return this.sites == null ? Output.empty() : this.sites;
    }

    public DirectLineChannelPropertiesArgs(
        @Nullable Output<String> directLineEmbedCode,
        @Nullable Output<List<DirectLineSiteArgs>> sites) {
        this.directLineEmbedCode = directLineEmbedCode;
        this.sites = sites;
    }

    private DirectLineChannelPropertiesArgs() {
        this.directLineEmbedCode = Output.empty();
        this.sites = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DirectLineChannelPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> directLineEmbedCode;
        private @Nullable Output<List<DirectLineSiteArgs>> sites;

        public Builder() {
    	      // Empty
        }

        public Builder(DirectLineChannelPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.directLineEmbedCode = defaults.directLineEmbedCode;
    	      this.sites = defaults.sites;
        }

        public Builder directLineEmbedCode(@Nullable Output<String> directLineEmbedCode) {
            this.directLineEmbedCode = directLineEmbedCode;
            return this;
        }

        public Builder directLineEmbedCode(@Nullable String directLineEmbedCode) {
            this.directLineEmbedCode = Output.ofNullable(directLineEmbedCode);
            return this;
        }

        public Builder sites(@Nullable Output<List<DirectLineSiteArgs>> sites) {
            this.sites = sites;
            return this;
        }

        public Builder sites(@Nullable List<DirectLineSiteArgs> sites) {
            this.sites = Output.ofNullable(sites);
            return this;
        }
        public DirectLineChannelPropertiesArgs build() {
            return new DirectLineChannelPropertiesArgs(directLineEmbedCode, sites);
        }
    }
}
