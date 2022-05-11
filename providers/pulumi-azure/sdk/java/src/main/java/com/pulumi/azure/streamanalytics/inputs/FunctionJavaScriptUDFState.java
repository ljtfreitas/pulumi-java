// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.streamanalytics.inputs;

import com.pulumi.azure.streamanalytics.inputs.FunctionJavaScriptUDFInputArgs;
import com.pulumi.azure.streamanalytics.inputs.FunctionJavaScriptUDFOutputArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FunctionJavaScriptUDFState extends com.pulumi.resources.ResourceArgs {

    public static final FunctionJavaScriptUDFState Empty = new FunctionJavaScriptUDFState();

    /**
     * One or more `input` blocks as defined below.
     * 
     */
    @Import(name="inputs")
    private @Nullable Output<List<FunctionJavaScriptUDFInputArgs>> inputs;

    /**
     * @return One or more `input` blocks as defined below.
     * 
     */
    public Optional<Output<List<FunctionJavaScriptUDFInputArgs>>> inputs() {
        return Optional.ofNullable(this.inputs);
    }

    /**
     * The name of the JavaScript UDF Function. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the JavaScript UDF Function. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * An `output` blocks as defined below.
     * 
     */
    @Import(name="output")
    private @Nullable Output<FunctionJavaScriptUDFOutputArgs> output;

    /**
     * @return An `output` blocks as defined below.
     * 
     */
    public Optional<Output<FunctionJavaScriptUDFOutputArgs>> output() {
        return Optional.ofNullable(this.output);
    }

    /**
     * The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The JavaScript of this UDF Function.
     * 
     */
    @Import(name="script")
    private @Nullable Output<String> script;

    /**
     * @return The JavaScript of this UDF Function.
     * 
     */
    public Optional<Output<String>> script() {
        return Optional.ofNullable(this.script);
    }

    /**
     * The name of the Stream Analytics Job where this Function should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="streamAnalyticsJobName")
    private @Nullable Output<String> streamAnalyticsJobName;

    /**
     * @return The name of the Stream Analytics Job where this Function should be created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> streamAnalyticsJobName() {
        return Optional.ofNullable(this.streamAnalyticsJobName);
    }

    private FunctionJavaScriptUDFState() {}

    private FunctionJavaScriptUDFState(FunctionJavaScriptUDFState $) {
        this.inputs = $.inputs;
        this.name = $.name;
        this.output = $.output;
        this.resourceGroupName = $.resourceGroupName;
        this.script = $.script;
        this.streamAnalyticsJobName = $.streamAnalyticsJobName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionJavaScriptUDFState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionJavaScriptUDFState $;

        public Builder() {
            $ = new FunctionJavaScriptUDFState();
        }

        public Builder(FunctionJavaScriptUDFState defaults) {
            $ = new FunctionJavaScriptUDFState(Objects.requireNonNull(defaults));
        }

        /**
         * @param inputs One or more `input` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder inputs(@Nullable Output<List<FunctionJavaScriptUDFInputArgs>> inputs) {
            $.inputs = inputs;
            return this;
        }

        /**
         * @param inputs One or more `input` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder inputs(List<FunctionJavaScriptUDFInputArgs> inputs) {
            return inputs(Output.of(inputs));
        }

        /**
         * @param inputs One or more `input` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder inputs(FunctionJavaScriptUDFInputArgs... inputs) {
            return inputs(List.of(inputs));
        }

        /**
         * @param name The name of the JavaScript UDF Function. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the JavaScript UDF Function. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param output An `output` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder output(@Nullable Output<FunctionJavaScriptUDFOutputArgs> output) {
            $.output = output;
            return this;
        }

        /**
         * @param output An `output` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder output(FunctionJavaScriptUDFOutputArgs output) {
            return output(Output.of(output));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param script The JavaScript of this UDF Function.
         * 
         * @return builder
         * 
         */
        public Builder script(@Nullable Output<String> script) {
            $.script = script;
            return this;
        }

        /**
         * @param script The JavaScript of this UDF Function.
         * 
         * @return builder
         * 
         */
        public Builder script(String script) {
            return script(Output.of(script));
        }

        /**
         * @param streamAnalyticsJobName The name of the Stream Analytics Job where this Function should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder streamAnalyticsJobName(@Nullable Output<String> streamAnalyticsJobName) {
            $.streamAnalyticsJobName = streamAnalyticsJobName;
            return this;
        }

        /**
         * @param streamAnalyticsJobName The name of the Stream Analytics Job where this Function should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder streamAnalyticsJobName(String streamAnalyticsJobName) {
            return streamAnalyticsJobName(Output.of(streamAnalyticsJobName));
        }

        public FunctionJavaScriptUDFState build() {
            return $;
        }
    }

}
