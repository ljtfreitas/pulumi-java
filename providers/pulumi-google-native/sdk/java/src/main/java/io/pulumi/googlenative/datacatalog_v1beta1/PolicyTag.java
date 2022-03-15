// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.datacatalog_v1beta1.PolicyTagArgs;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a policy tag in the specified taxonomy.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:datacatalog/v1beta1:PolicyTag")
public class PolicyTag extends io.pulumi.resources.CustomResource {
    /**
     * Resource names of child policy tags of this policy tag.
     * 
     */
    @Export(name="childPolicyTags", type=List.class, parameters={String.class})
    private Output<List<String>> childPolicyTags;

    /**
     * @return Resource names of child policy tags of this policy tag.
     * 
     */
    public Output<List<String>> getChildPolicyTags() {
        return this.childPolicyTags;
    }
    /**
     * Description of this policy tag. It must: contain only unicode characters, tabs, newlines, carriage returns and page breaks; and be at most 2000 bytes long when encoded in UTF-8. If not set, defaults to an empty description. If not set, defaults to an empty description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Description of this policy tag. It must: contain only unicode characters, tabs, newlines, carriage returns and page breaks; and be at most 2000 bytes long when encoded in UTF-8. If not set, defaults to an empty description. If not set, defaults to an empty description.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * User defined name of this policy tag. It must: be unique within the parent taxonomy; contain only unicode letters, numbers, underscores, dashes and spaces; not start or end with spaces; and be at most 200 bytes long when encoded in UTF-8.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return User defined name of this policy tag. It must: be unique within the parent taxonomy; contain only unicode letters, numbers, underscores, dashes and spaces; not start or end with spaces; and be at most 200 bytes long when encoded in UTF-8.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Resource name of this policy tag, whose format is: "projects/{project_number}/locations/{location_id}/taxonomies/{taxonomy_id}/policyTags/{id}".
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name of this policy tag, whose format is: "projects/{project_number}/locations/{location_id}/taxonomies/{taxonomy_id}/policyTags/{id}".
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Resource name of this policy tag's parent policy tag (e.g. for the "LatLong" policy tag in the example above, this field contains the resource name of the "Geolocation" policy tag). If empty, it means this policy tag is a top level policy tag (e.g. this field is empty for the "Geolocation" policy tag in the example above). If not set, defaults to an empty string.
     * 
     */
    @Export(name="parentPolicyTag", type=String.class, parameters={})
    private Output<String> parentPolicyTag;

    /**
     * @return Resource name of this policy tag's parent policy tag (e.g. for the "LatLong" policy tag in the example above, this field contains the resource name of the "Geolocation" policy tag). If empty, it means this policy tag is a top level policy tag (e.g. this field is empty for the "Geolocation" policy tag in the example above). If not set, defaults to an empty string.
     * 
     */
    public Output<String> getParentPolicyTag() {
        return this.parentPolicyTag;
    }

    public interface BuilderApplicator {
        public void apply(PolicyTagArgs.Builder a);
    }
    private static io.pulumi.googlenative.datacatalog_v1beta1.PolicyTagArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.datacatalog_v1beta1.PolicyTagArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public PolicyTag(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PolicyTag(String name) {
        this(name, PolicyTagArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PolicyTag(String name, PolicyTagArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PolicyTag(String name, PolicyTagArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datacatalog/v1beta1:PolicyTag", name, args == null ? PolicyTagArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private PolicyTag(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datacatalog/v1beta1:PolicyTag", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PolicyTag get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PolicyTag(name, id, options);
    }
}
