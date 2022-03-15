// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.recaptcha;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.recaptcha.EnterpriseKeyArgs;
import io.pulumi.gcp.recaptcha.inputs.EnterpriseKeyState;
import io.pulumi.gcp.recaptcha.outputs.EnterpriseKeyAndroidSettings;
import io.pulumi.gcp.recaptcha.outputs.EnterpriseKeyIosSettings;
import io.pulumi.gcp.recaptcha.outputs.EnterpriseKeyTestingOptions;
import io.pulumi.gcp.recaptcha.outputs.EnterpriseKeyWebSettings;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The RecaptchaEnterprise Key resource
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Key can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:recaptcha/enterpriseKey:EnterpriseKey default projects/{{project}}/keys/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:recaptcha/enterpriseKey:EnterpriseKey default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:recaptcha/enterpriseKey:EnterpriseKey default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:recaptcha/enterpriseKey:EnterpriseKey")
public class EnterpriseKey extends io.pulumi.resources.CustomResource {
    /**
     * Settings for keys that can be used by Android apps.
     * 
     */
    @Export(name="androidSettings", type=EnterpriseKeyAndroidSettings.class, parameters={})
    private Output</* @Nullable */ EnterpriseKeyAndroidSettings> androidSettings;

    /**
     * @return Settings for keys that can be used by Android apps.
     * 
     */
    public Output</* @Nullable */ EnterpriseKeyAndroidSettings> getAndroidSettings() {
        return this.androidSettings;
    }
    /**
     * The timestamp corresponding to the creation of this Key.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The timestamp corresponding to the creation of this Key.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Human-readable display name of this key. Modifiable by user.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Human-readable display name of this key. Modifiable by user.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Settings for keys that can be used by iOS apps.
     * 
     */
    @Export(name="iosSettings", type=EnterpriseKeyIosSettings.class, parameters={})
    private Output</* @Nullable */ EnterpriseKeyIosSettings> iosSettings;

    /**
     * @return Settings for keys that can be used by iOS apps.
     * 
     */
    public Output</* @Nullable */ EnterpriseKeyIosSettings> getIosSettings() {
        return this.iosSettings;
    }
    /**
     * See [Creating and managing labels](https://cloud.google.com/recaptcha-enterprise/docs/labels).
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return See [Creating and managing labels](https://cloud.google.com/recaptcha-enterprise/docs/labels).
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The resource name for the Key in the format "projects/{project}/keys/{key}".
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name for the Key in the format "projects/{project}/keys/{key}".
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The project for the resource
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project for the resource
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Options for user acceptance testing.
     * 
     */
    @Export(name="testingOptions", type=EnterpriseKeyTestingOptions.class, parameters={})
    private Output</* @Nullable */ EnterpriseKeyTestingOptions> testingOptions;

    /**
     * @return Options for user acceptance testing.
     * 
     */
    public Output</* @Nullable */ EnterpriseKeyTestingOptions> getTestingOptions() {
        return this.testingOptions;
    }
    /**
     * Settings for keys that can be used by websites.
     * 
     */
    @Export(name="webSettings", type=EnterpriseKeyWebSettings.class, parameters={})
    private Output</* @Nullable */ EnterpriseKeyWebSettings> webSettings;

    /**
     * @return Settings for keys that can be used by websites.
     * 
     */
    public Output</* @Nullable */ EnterpriseKeyWebSettings> getWebSettings() {
        return this.webSettings;
    }

    public interface BuilderApplicator {
        public void apply(EnterpriseKeyArgs.Builder a);
    }
    private static io.pulumi.gcp.recaptcha.EnterpriseKeyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.recaptcha.EnterpriseKeyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public EnterpriseKey(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EnterpriseKey(String name) {
        this(name, EnterpriseKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EnterpriseKey(String name, EnterpriseKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EnterpriseKey(String name, EnterpriseKeyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:recaptcha/enterpriseKey:EnterpriseKey", name, args == null ? EnterpriseKeyArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private EnterpriseKey(String name, Output<String> id, @Nullable EnterpriseKeyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:recaptcha/enterpriseKey:EnterpriseKey", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static EnterpriseKey get(String name, Output<String> id, @Nullable EnterpriseKeyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EnterpriseKey(name, id, state, options);
    }
}
