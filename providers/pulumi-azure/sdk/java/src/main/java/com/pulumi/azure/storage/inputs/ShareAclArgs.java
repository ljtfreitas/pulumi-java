// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.inputs;

import com.pulumi.azure.storage.inputs.ShareAclAccessPolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ShareAclArgs extends com.pulumi.resources.ResourceArgs {

    public static final ShareAclArgs Empty = new ShareAclArgs();

    /**
     * An `access_policy` block as defined below.
     * 
     */
    @Import(name="accessPolicies")
    private @Nullable Output<List<ShareAclAccessPolicyArgs>> accessPolicies;

    /**
     * @return An `access_policy` block as defined below.
     * 
     */
    public Optional<Output<List<ShareAclAccessPolicyArgs>>> accessPolicies() {
        return Optional.ofNullable(this.accessPolicies);
    }

    /**
     * The ID which should be used for this Shared Identifier.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID which should be used for this Shared Identifier.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private ShareAclArgs() {}

    private ShareAclArgs(ShareAclArgs $) {
        this.accessPolicies = $.accessPolicies;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ShareAclArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ShareAclArgs $;

        public Builder() {
            $ = new ShareAclArgs();
        }

        public Builder(ShareAclArgs defaults) {
            $ = new ShareAclArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessPolicies An `access_policy` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder accessPolicies(@Nullable Output<List<ShareAclAccessPolicyArgs>> accessPolicies) {
            $.accessPolicies = accessPolicies;
            return this;
        }

        /**
         * @param accessPolicies An `access_policy` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder accessPolicies(List<ShareAclAccessPolicyArgs> accessPolicies) {
            return accessPolicies(Output.of(accessPolicies));
        }

        /**
         * @param accessPolicies An `access_policy` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder accessPolicies(ShareAclAccessPolicyArgs... accessPolicies) {
            return accessPolicies(List.of(accessPolicies));
        }

        /**
         * @param id The ID which should be used for this Shared Identifier.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID which should be used for this Shared Identifier.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public ShareAclArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
