// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.servicecatalog.ServiceActionArgs;
import io.pulumi.aws.servicecatalog.inputs.ServiceActionState;
import io.pulumi.aws.servicecatalog.outputs.ServiceActionDefinition;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Service Catalog self-service action.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_servicecatalog_service_action` can be imported using the service action ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:servicecatalog/serviceAction:ServiceAction example act-f1w12eperfslh
 * ```
 * 
 */
@ResourceType(type="aws:servicecatalog/serviceAction:ServiceAction")
public class ServiceAction extends io.pulumi.resources.CustomResource {
    /**
     * Language code. Valid values are `en` (English), `jp` (Japanese), and `zh` (Chinese). Default is `en`.
     * 
     */
    @OutputExport(name="acceptLanguage", type=String.class, parameters={})
    private Output</* @Nullable */ String> acceptLanguage;

    /**
     * @return Language code. Valid values are `en` (English), `jp` (Japanese), and `zh` (Chinese). Default is `en`.
     * 
     */
    public Output</* @Nullable */ String> getAcceptLanguage() {
        return this.acceptLanguage;
    }
    /**
     * Self-service action definition configuration block. Detailed below.
     * 
     */
    @OutputExport(name="definition", type=ServiceActionDefinition.class, parameters={})
    private Output<ServiceActionDefinition> definition;

    /**
     * @return Self-service action definition configuration block. Detailed below.
     * 
     */
    public Output<ServiceActionDefinition> getDefinition() {
        return this.definition;
    }
    /**
     * Self-service action description.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Self-service action description.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Self-service action name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Self-service action name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceAction(String name, ServiceActionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicecatalog/serviceAction:ServiceAction", name, args == null ? ServiceActionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ServiceAction(String name, Input<String> id, @Nullable ServiceActionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicecatalog/serviceAction:ServiceAction", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
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
    public static ServiceAction get(String name, Input<String> id, @Nullable ServiceActionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ServiceAction(name, id, state, options);
    }
}
