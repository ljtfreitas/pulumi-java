// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.compute.VirtualMachineRunCommandByVirtualMachineArgs;
import io.pulumi.azurenative.compute.outputs.RunCommandInputParameterResponse;
import io.pulumi.azurenative.compute.outputs.VirtualMachineRunCommandInstanceViewResponse;
import io.pulumi.azurenative.compute.outputs.VirtualMachineRunCommandScriptSourceResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Describes a Virtual Machine run command.
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:compute:VirtualMachineRunCommandByVirtualMachine myRunCommand /subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/virtualMachines/myVM/runCommands/myRunCommand 
 * ```
 * 
 */
@ResourceType(type="azure-native:compute:VirtualMachineRunCommandByVirtualMachine")
public class VirtualMachineRunCommandByVirtualMachine extends io.pulumi.resources.CustomResource {
    /**
     * Optional. If set to true, provisioning will complete as soon as the script starts and will not wait for script to complete.
     * 
     */
    @Export(name="asyncExecution", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> asyncExecution;

    /**
     * @return Optional. If set to true, provisioning will complete as soon as the script starts and will not wait for script to complete.
     * 
     */
    public Output</* @Nullable */ Boolean> getAsyncExecution() {
        return this.asyncExecution;
    }
    /**
     * Specifies the Azure storage blob where script error stream will be uploaded.
     * 
     */
    @Export(name="errorBlobUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> errorBlobUri;

    /**
     * @return Specifies the Azure storage blob where script error stream will be uploaded.
     * 
     */
    public Output</* @Nullable */ String> getErrorBlobUri() {
        return this.errorBlobUri;
    }
    /**
     * The virtual machine run command instance view.
     * 
     */
    @Export(name="instanceView", type=VirtualMachineRunCommandInstanceViewResponse.class, parameters={})
    private Output<VirtualMachineRunCommandInstanceViewResponse> instanceView;

    /**
     * @return The virtual machine run command instance view.
     * 
     */
    public Output<VirtualMachineRunCommandInstanceViewResponse> getInstanceView() {
        return this.instanceView;
    }
    /**
     * Resource location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Specifies the Azure storage blob where script output stream will be uploaded.
     * 
     */
    @Export(name="outputBlobUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> outputBlobUri;

    /**
     * @return Specifies the Azure storage blob where script output stream will be uploaded.
     * 
     */
    public Output</* @Nullable */ String> getOutputBlobUri() {
        return this.outputBlobUri;
    }
    /**
     * The parameters used by the script.
     * 
     */
    @Export(name="parameters", type=List.class, parameters={RunCommandInputParameterResponse.class})
    private Output</* @Nullable */ List<RunCommandInputParameterResponse>> parameters;

    /**
     * @return The parameters used by the script.
     * 
     */
    public Output</* @Nullable */ List<RunCommandInputParameterResponse>> getParameters() {
        return this.parameters;
    }
    /**
     * The parameters used by the script.
     * 
     */
    @Export(name="protectedParameters", type=List.class, parameters={RunCommandInputParameterResponse.class})
    private Output</* @Nullable */ List<RunCommandInputParameterResponse>> protectedParameters;

    /**
     * @return The parameters used by the script.
     * 
     */
    public Output</* @Nullable */ List<RunCommandInputParameterResponse>> getProtectedParameters() {
        return this.protectedParameters;
    }
    /**
     * The provisioning state, which only appears in the response.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state, which only appears in the response.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Specifies the user account password on the VM when executing the run command.
     * 
     */
    @Export(name="runAsPassword", type=String.class, parameters={})
    private Output</* @Nullable */ String> runAsPassword;

    /**
     * @return Specifies the user account password on the VM when executing the run command.
     * 
     */
    public Output</* @Nullable */ String> getRunAsPassword() {
        return this.runAsPassword;
    }
    /**
     * Specifies the user account on the VM when executing the run command.
     * 
     */
    @Export(name="runAsUser", type=String.class, parameters={})
    private Output</* @Nullable */ String> runAsUser;

    /**
     * @return Specifies the user account on the VM when executing the run command.
     * 
     */
    public Output</* @Nullable */ String> getRunAsUser() {
        return this.runAsUser;
    }
    /**
     * The source of the run command script.
     * 
     */
    @Export(name="source", type=VirtualMachineRunCommandScriptSourceResponse.class, parameters={})
    private Output</* @Nullable */ VirtualMachineRunCommandScriptSourceResponse> source;

    /**
     * @return The source of the run command script.
     * 
     */
    public Output</* @Nullable */ VirtualMachineRunCommandScriptSourceResponse> getSource() {
        return this.source;
    }
    /**
     * Resource tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The timeout in seconds to execute the run command.
     * 
     */
    @Export(name="timeoutInSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> timeoutInSeconds;

    /**
     * @return The timeout in seconds to execute the run command.
     * 
     */
    public Output</* @Nullable */ Integer> getTimeoutInSeconds() {
        return this.timeoutInSeconds;
    }
    /**
     * Resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(VirtualMachineRunCommandByVirtualMachineArgs.Builder a);
    }
    private static io.pulumi.azurenative.compute.VirtualMachineRunCommandByVirtualMachineArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.compute.VirtualMachineRunCommandByVirtualMachineArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public VirtualMachineRunCommandByVirtualMachine(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualMachineRunCommandByVirtualMachine(String name) {
        this(name, VirtualMachineRunCommandByVirtualMachineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualMachineRunCommandByVirtualMachine(String name, VirtualMachineRunCommandByVirtualMachineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualMachineRunCommandByVirtualMachine(String name, VirtualMachineRunCommandByVirtualMachineArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:VirtualMachineRunCommandByVirtualMachine", name, args == null ? VirtualMachineRunCommandByVirtualMachineArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private VirtualMachineRunCommandByVirtualMachine(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:VirtualMachineRunCommandByVirtualMachine", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:compute/v20200601:VirtualMachineRunCommandByVirtualMachine").build()),
                Output.of(Alias.builder().setType("azure-native:compute/v20201201:VirtualMachineRunCommandByVirtualMachine").build()),
                Output.of(Alias.builder().setType("azure-native:compute/v20210301:VirtualMachineRunCommandByVirtualMachine").build()),
                Output.of(Alias.builder().setType("azure-native:compute/v20210401:VirtualMachineRunCommandByVirtualMachine").build()),
                Output.of(Alias.builder().setType("azure-native:compute/v20210701:VirtualMachineRunCommandByVirtualMachine").build()),
                Output.of(Alias.builder().setType("azure-native:compute/v20211101:VirtualMachineRunCommandByVirtualMachine").build())
            ))
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
    public static VirtualMachineRunCommandByVirtualMachine get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VirtualMachineRunCommandByVirtualMachine(name, id, options);
    }
}
