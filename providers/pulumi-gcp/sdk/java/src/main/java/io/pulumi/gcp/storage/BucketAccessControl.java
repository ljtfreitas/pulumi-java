// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.storage.BucketAccessControlArgs;
import io.pulumi.gcp.storage.inputs.BucketAccessControlState;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="gcp:storage/bucketAccessControl:BucketAccessControl")
public class BucketAccessControl extends io.pulumi.resources.CustomResource {
    @OutputExport(name="bucket", type=String.class, parameters={})
    private Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket;
    }
    @OutputExport(name="domain", type=String.class, parameters={})
    private Output<String> domain;

    public Output<String> getDomain() {
        return this.domain;
    }
    @OutputExport(name="email", type=String.class, parameters={})
    private Output<String> email;

    public Output<String> getEmail() {
        return this.email;
    }
    @OutputExport(name="entity", type=String.class, parameters={})
    private Output<String> entity;

    public Output<String> getEntity() {
        return this.entity;
    }
    @OutputExport(name="role", type=String.class, parameters={})
    private Output</* @Nullable */ String> role;

    public Output</* @Nullable */ String> getRole() {
        return this.role;
    }

    public BucketAccessControl(String name, BucketAccessControlArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:storage/bucketAccessControl:BucketAccessControl", name, args == null ? BucketAccessControlArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private BucketAccessControl(String name, Input<String> id, @Nullable BucketAccessControlState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:storage/bucketAccessControl:BucketAccessControl", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static BucketAccessControl get(String name, Input<String> id, @Nullable BucketAccessControlState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BucketAccessControl(name, id, state, options);
    }
}